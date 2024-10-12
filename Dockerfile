# Base image
FROM openjdk:17-jdk-slim

# Create a directory for the app
WORKDIR /app

# Copy the jar file into the container
COPY ./build/libs/actuator-0.0.1-SNAPSHOT.jar app.jar


# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
