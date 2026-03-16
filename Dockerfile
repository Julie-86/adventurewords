# Use official Eclipse Temurin image with Java 17
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy only pom.xml and download dependencies (for caching)
COPY pom.xml .
RUN apk add --no-cache maven && mvn dependency:go-offline

# Copy only the selected source files
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Copy the generated JAR
COPY target/adventurewords-*.jar app.jar

# Expose port 8081 (must match application.properties)
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java","-jar","app.jar"]
