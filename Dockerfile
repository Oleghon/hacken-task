FROM  openjdk:17
MAINTAINER oleg cherepnin

ARG JAR_BASE=hacken-test-task

ENV JAR_FILE="${JAR_BASE}.jar"
ARG JAR_PATH="build/libs/${JAR_FILE}"
COPY ${JAR_PATH} /app/hacken-test-task.jar
RUN echo ${JAR_FILE}
ENTRYPOINT ["java", "-jar", "/app/hacken-test-task.jar"]
