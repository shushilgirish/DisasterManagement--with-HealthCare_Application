#!/bin/sh
# Compose healthcheck for the `app` service.
# This container runs several components (X display, VNC server, noVNC web client and
# the Java Swing application), so each one is probed and the failing ones are named.
fail=""

if ! pgrep -f "Xvfb ${DISPLAY:-:99}" >/dev/null 2>&1; then
    fail="$fail Xvfb(display)"
fi
if ! pgrep -f "x11vnc" >/dev/null 2>&1; then
    fail="$fail x11vnc(vnc-server)"
fi
if ! pgrep -f "websockify" >/dev/null 2>&1; then
    fail="$fail websockify(noVNC-web)"
fi
if ! pgrep -f "UI.NewJFrame" >/dev/null 2>&1; then
    fail="$fail java-swing-app"
fi
if ! curl -fsS -o /dev/null "http://127.0.0.1:3000/vnc.html"; then
    fail="$fail noVNC-http(port-3000)"
fi

if [ -n "$fail" ]; then
    echo "healthcheck FAILED - not running:$fail"
    exit 1
fi

echo "healthcheck OK - display, VNC server, noVNC web client and the Java app are all up"
