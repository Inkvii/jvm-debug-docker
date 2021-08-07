#!/bin/sh

mvn clean install
mv target/docker-test.war dist

echo "Build completed!"
