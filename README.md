# Goal of this project

Using the following technologies create docker image which can be debugged and its classes hot swapped on demand

- maven
- java 11
- springboot
- docker (docker compose)
- tomcat (embedded, run as .war, but can be even .jar I guess)

Note that there are multiple branches.

- master - using embedded tomcat
- tomcat - using tomcat docker to deploy .war

## How to attach debugger

- create Remote JVM Debug configuration in IntelliJ
- use port 9999 (see Dockerfile) which is exposed for this purpose to connect to debug session
- use breakpoints in IntelliJ on a controller to get fastest input
- open http://localhost:8020 in browser
- for hot-reload to take effect, classes must be build using IntelliJ's `Build Project`

