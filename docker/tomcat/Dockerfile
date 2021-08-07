FROM tomcat:9-jdk11

# by default JPDA_ADDRESS is bound towards localhost, not 0.0.0.0 which is reason why it might not be exposed unless this is specified
ENV JPDA_ADDRESS=0.0.0.0:9999
ENV JPDA_TRANSPORT=dt_socket

# tomcat catalina.sh says "jpda start" but that doesnt work, "jpda run" does.
CMD ["/usr/local/tomcat/bin/catalina.sh","jpda","run"]
EXPOSE 9999
