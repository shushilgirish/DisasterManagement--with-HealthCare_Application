# DisasterManagement--with-HealthCare_Application

Java 17 Swing desktop application (NetBeans/Ant) for disaster and healthcare
management, backed by MySQL. The original submission artifacts
(`FinalProject-DisasatermanagementwithHealthCare.rar`, `Disaster and Healthcare MGMT.pptx`)
are kept in the repository root; the application itself lives in
`Disaster-Management-with-HealthCare-finalproject/`.

## Run it

```bash
docker compose -f docker-compose.base44.yml up -d --build
```

Open http://localhost:3000. A Swing window cannot be displayed by a browser, so the
application runs on a virtual X display inside the container and that desktop is
streamed to the page with VNC/noVNC. The MySQL database is created and seeded
automatically from `Dependencies/Dump20240519`.

Sign in with a seeded account, for example:

| role | user | password |
| --- | --- | --- |
| admin | `Admin11` | `Admin12341!` |
| response team | `422434` | `Vmyp!1ssword` |
| logistics team | `233442` | `Password123!2` |
| hospital | `doc2` … `doc10` | `Abc1234!` |

After editing Java code, `docker compose -f docker-compose.base44.yml restart app`
recompiles and restarts the application.

See `AGENTS.md` for the environment details and quirks.
