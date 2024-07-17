FROM maven:3.8.5-openjdk-17 AS build
COPY pom.xml .
COPY /src /src
RUN mvn clean package

FROM openjdk:21-jdk
COPY --from=build /target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]