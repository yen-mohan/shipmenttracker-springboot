# Use official OpenJDK image as base
FROM openjdk:21-jdk-slim

# Argument to specify the built jar file name (adjust if your jar has a different name)
ARG JAR_FILE=target/shipmenttracker-0.0.1-SNAPSHOT.jar

# Copy the jar file into the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
