FROM openjdk:8-jre-alpine

MAINTAINER Jamie akjamie.zhang@outlook.com

VOLUME /tmp

#copy local runnable springboot jar file to container
ADD *.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]