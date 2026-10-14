FROM eclipse-temurin:21-jdk-alpine
LABEL authors="ivanm"
COPY target/SpringBoot_ProgramObrazovanja-0.0.1-SNAPSHOT.jar zadatak.jar
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/zadatak.jar"]