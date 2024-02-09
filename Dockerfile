FROM maven:3.9.6-eclipse-temurin-21 as build
WORKDIR /workspace/app
COPY . ./
RUN mvn clean install -DskipTests
FROM amazoncorretto:21-alpine3.19
COPY --from=build /workspace/app/target/*-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]