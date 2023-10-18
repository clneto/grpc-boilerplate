FROM openjdk:19
VOLUME /tmp
EXPOSE 8000
ARG JAR_FILE=target/client-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
