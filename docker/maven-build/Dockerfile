FROM maven:3.6.0-jdk-11-slim

WORKDIR /src
COPY ./src .
COPY ./pom.xml .
COPY ./docker/maven-build/maven-build-compiler.sh .

RUN ["mkdir", "-p", "dist"]
CMD ["./maven-build-compiler.sh"]

#ENTRYPOINT ["cd /src", "&& ","mvn clean install","&&", "mv target/docker-test.war dist"]
