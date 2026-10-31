FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/java-cicd-project-1.0.0.jar app.jar
CMD ["java", "-jar", "app.jar"]
