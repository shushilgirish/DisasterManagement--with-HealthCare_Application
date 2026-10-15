#!/bin/sh
# Base44 sandbox entrypoint for the Disaster Management with HealthCare desktop app.
#
# The app is a Java 17 Swing program that talks to MySQL on jdbc:mysql://localhost:3306/hms.
# A browser cannot display a Swing window, so this script:
#   1. relays the app's hardcoded "localhost:3306" to the compose `db` service with socat,
#   2. compiles the bind-mounted sources (so a container restart picks up repo edits),
#   3. runs a virtual X display (Xvfb) with a VNC server (x11vnc),
#   4. serves that VNC session as a web page (noVNC) on port 3000 for the preview,
#   5. starts the Swing application.
#
# Everything runs inside the single `app` service; no application source is modified.
set -eu

APP_DIR="${APP_DIR:-/workspace/Disaster-Management-with-HealthCare-finalproject}"
LIB_DIR="${LIB_DIR:-/workspace/Dependencies}"
DB_HOST="${DB_HOST:-db}"
CLASSES_DIR="${CLASSES_DIR:-/tmp/hms-classes}"
NOVNC_WEB_DIR="${NOVNC_WEB_DIR:-/tmp/novnc-web}"
JARS="$LIB_DIR/jfreechart-1.0.19.jar:$LIB_DIR/jcommon-1.0.23.jar:$LIB_DIR/mysql-connector-j-8.2.0.jar:$LIB_DIR/AbsoluteLayout-RELEASE130.jar"

export DISPLAY="${DISPLAY:-:99}"
# Just large enough for the app's packed window (1330x764) so the VNC view has
# almost no letterboxing when it is scaled into the preview iframe.
SCREEN_GEOMETRY="${SCREEN_GEOMETRY:-1400x820x24}"

log() { echo "[base44] $*"; }

# --- 1. MySQL relay: the app connects to localhost:3306, MySQL runs in the `db` service.
log "relaying 127.0.0.1:3306 -> ${DB_HOST}:3306"
socat TCP-LISTEN:3306,fork,reuseaddr TCP:"${DB_HOST}:3306" >/tmp/socat.log 2>&1 &

# --- 2. Compile from the mounted source tree on every start.
SOURCE_COUNT="$(find "$APP_DIR/src" -name '*.java' | wc -l)"
log "compiling ${SOURCE_COUNT} java sources with $(javac -version 2>&1)"
rm -rf "$CLASSES_DIR"
mkdir -p "$CLASSES_DIR"
find "$APP_DIR/src" -name '*.java' > /tmp/base44-sources.txt
javac -nowarn -encoding UTF-8 -d "$CLASSES_DIR" -cp "$JARS" @/tmp/base44-sources.txt
log "compile finished"

# --- 3. Virtual X display.
log "starting Xvfb on ${DISPLAY} (${SCREEN_GEOMETRY})"
Xvfb "$DISPLAY" -screen 0 "$SCREEN_GEOMETRY" -nolisten tcp >/tmp/xvfb.log 2>&1 &
for _ in $(seq 1 50); do
    [ -S "/tmp/.X11-unix/X${DISPLAY#:}" ] && break
    sleep 0.2
done
if [ ! -S "/tmp/.X11-unix/X${DISPLAY#:}" ]; then
    log "ERROR: Xvfb did not come up; see /tmp/xvfb.log"
    tail -n 20 /tmp/xvfb.log
    exit 1
fi

log "starting x11vnc on port 5900"
x11vnc -display "$DISPLAY" -forever -shared -nopw -noxdamage -quiet -rfbport 5900 >/tmp/x11vnc.log 2>&1 &

# --- 4. Serve the VNC session to the browser on port 3000.
log "preparing noVNC web root ${NOVNC_WEB_DIR}"
rm -rf "$NOVNC_WEB_DIR"
mkdir -p "$NOVNC_WEB_DIR"
cp -r /usr/share/novnc/. "$NOVNC_WEB_DIR"/
# The preview loads "/" directly, so make the root page the VNC client itself and
# have it connect without any user interaction.
cat >"$NOVNC_WEB_DIR/index.html" <<'HTML'
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>Disaster Management with HealthCare</title>
    <style>
      html, body { margin: 0; padding: 0; height: 100%; background: #1b1b1b; }
      iframe { border: 0; width: 100%; height: 100%; display: block; }
    </style>
  </head>
  <body>
    <iframe src="vnc.html?autoconnect=1&resize=scale&reconnect=1&reconnect_delay=1000"></iframe>
  </body>
</html>
HTML
log "starting noVNC/websockify on port 3000"
websockify --web="$NOVNC_WEB_DIR" 3000 127.0.0.1:5900 >/tmp/websockify.log 2>&1 &

# --- 5. Launch the desktop application (becomes PID 1, so the container tracks it).
log "starting UI.NewJFrame"
exec java -Djava.awt.headless=false -cp "$CLASSES_DIR:$APP_DIR/src:$JARS" UI.NewJFrame
