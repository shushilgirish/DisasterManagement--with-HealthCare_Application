# AGENTS.md

Notes for anyone (human or agent) working on this repository in the Base44 sandbox.

## What this project is

`Disaster and Healthcare MGMT.pptx` and `FinalProject-...rar` are the original
submission artifacts. The application itself is a **Java 17 Swing desktop program**
(NetBeans/Ant project) that keeps all of its data in **MySQL**:

- project root: `Disaster-Management-with-HealthCare-finalproject/` (entry point `UI.NewJFrame`)
- `Dependencies/` – the jars the sources actually import, plus the SQL dumps
- the sources were extracted from the `.rar`; that archive is kept as the original copy

Everything runs through `docker-compose.base44.yml`.

## How to run it

```bash
docker compose -f docker-compose.base44.yml up -d --build
```

- **Preview / UI**: http://localhost:3000 – a Swing window cannot be rendered by a
  browser, so the `app` container runs the program on a virtual X display (`Xvfb`),
  exposes that display over VNC (`x11vnc`) and publishes it as a web page (`noVNC`)
  on port 3000.
- **Database**: the `db` service (MySQL 8) is created and seeded by the one-shot
  `db-init` service from `Dependencies/Dump20240519/*.sql`; the `app` service waits for
  both via `depends_on`.

Log in with any of the seeded accounts, e.g.

| role | user | password |
| --- | --- | --- |
| admin | `Admin11` | `Admin12341!` |
| response team | `422434` | `Vmyp!1ssword` |
| logistics team | `233442` | `Password123!2` |
| hospital | `doc2` … `doc10` | `Abc1234!` |

Every successful login shows a modal "Access Granted" dialog first; it must be
dismissed before the dashboard appears.

### Picking up code changes

The container compiles the mounted sources on every start (nothing is baked into the
image), so after editing Java code:

```bash
docker compose -f docker-compose.base44.yml restart app
```

## Non-obvious things that were needed to run this project

- **The app hardcodes `jdbc:mysql://localhost:3306/hms` and the root password**
  (`Rama@$111517105089`) in ~35 files. Rather than editing all of them, the `app`
  container runs `socat` to relay its own `localhost:3306` to the `db` service, and the
  `db` service uses that same password. The JDBC host/credential is therefore *not*
  configurable by environment variable – changing the database location means changing
  the source.
- **`--lower-case-table-names=1` on MySQL is required.** The code contains at least one
  query with a capitalized table name (`select * from Volunteers`) while the dump
  creates `volunteers`; that only works on the case-insensitive MySQL the project was
  developed against. The setting must be present when the data directory is
  initialized, so it lives in the `db` service `command:`.
- **`--default-authentication-plugin=mysql_native_password` is required.** Connector/J
  connects without TLS and without `allowPublicKeyRetrieval`, which
  `caching_sha2_password` (the MySQL 8 default) rejects.
- **A restarted `app` container keeps its `/tmp`, and Docker signals only PID 1**, so a
  stopped Xvfb leaves `/tmp/.X99-lock` and a dead `/tmp/.X11-unix/X99` behind. The
  entrypoint therefore deletes both before starting Xvfb and waits for a *real* X
  connection (`xdotool getdisplaygeometry`) instead of just the socket file; without
  that, a restart died with `java.awt.AWTError: Can't connect to X11 window server`.
- **`org.netbeans.lib.awtextra` (AbsoluteLayout)** is used by 34 UI classes but was
  never shipped with the project – it came from the original machine's NetBeans
  installation. `Dependencies/AbsoluteLayout-RELEASE130.jar` (Maven Central,
  `org.netbeans.external:AbsoluteLayout`) was added for it.
- **`nbproject/project.properties` was repointed** at `../Dependencies/*.jar`: the
  original classpath referenced the author's Windows `Downloads` folder and a NetBeans
  library definition, so the project could not build anywhere else.
- The window shown in the preview is `pack()`ed to 1330x764; the virtual screen is
  sized to 1400x820 (`SCREEN_GEOMETRY`, read by `scripts/base44-dev-entrypoint.sh`) so
  the app fills the preview instead of sitting in a large empty desktop.
- No external services (no mail, maps or payment APIs) and no credentials from the user
  are required. `secrets` in `.base44/environment.json` is intentionally empty.

## Verifying a change

- `docker compose -f docker-compose.base44.yml ps` – all services `healthy`, `db-init`
  `Exited (0)`.
- `/bin/sh /workspace/scripts/base44-healthcheck.sh` (run inside `app`) checks the
  display, the VNC server, the noVNC web client and the Java process, and names
  whichever is missing.
- Screenshots of the running UI can look confusing: it is a desktop app, so the image
  shows the Swing window, and modal "Access Granted"/error dialogs block the UI until
  they are dismissed. There is no DOM/HTTP surface to assert against.
- To drive the desktop (e.g. to test the login) use `xdotool` inside the container:

```bash
docker compose -f docker-compose.base44.yml exec app sh -c '
  export DISPLAY=:99
  xdotool mousemove 352 26 click 1 && xdotool type "Admin11"
  xdotool mousemove 352 64 click 1 && xdotool type "Admin12341!"
  xdotool mousemove 528 54 click 1'          # Login button
```

- There is no test suite in the project (`test/` is empty); verification is done by
  running the app.
- The application prints `Loading class com.mysql.jdbc.Driver ... deprecated` and
  `35null40null...` on startup. Both are the app's own noise, not errors.
- A MySQL error at startup appears as a modal dialog and blocks the app (the DB reads
  happen in the `UI.NewJFrame` constructor); if the preview looks frozen, check the
  `app` logs and whether a `Message` window is open.
