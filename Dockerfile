FROM openjdk:13-jdk-alpine
EXPOSE 8080
VOLUME /tmp
COPY /target/java-clean-arch-example-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]