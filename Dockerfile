FROM gradle:5.6.0-jdk8 as build
WORKDIR /openAPITEst
COPY build.gradle build.gradle
COPY settings.gradle settings.gradle
COPY src src
COPY conf conf
RUN gradle shadowJar

FROM openjdk:8-jdk-slim
WORKDIR /openAPITEst
COPY --from=build /openAPITEst/build/libs/openAPITEst-1.0.0-all.jar app.jar
COPY conf conf
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
