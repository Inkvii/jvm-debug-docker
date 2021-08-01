FROM openjdk:11

COPY target/docker-test.war /tmp
CMD ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:9999", "/tmp/docker-test.war" ]
EXPOSE 9999
