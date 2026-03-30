# ---------- Stage 1: Build application ----------
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom first to leverage Docker cache for dependencies
COPY pom.xml ./
RUN mvn dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests

# ---------- Stage 2: Run application ----------
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Create non-root user for security
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

COPY --from=build /app/target/adventurewords-1.0-SNAPSHOT.jar app.jar

# Use env variable for port
ENV SERVER_PORT=8081
EXPOSE ${SERVER_PORT}

# Run the app with memory limits
ENTRYPOINT ["java", "-Xms256m", "-Xmx512m", "-jar", "app.jar"]
