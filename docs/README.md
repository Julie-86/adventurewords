# AdventureWords 🎮

A Spring Boot-based backend application for a word guessing game (Hangman-style), designed as a learning project for Java, DevOps, and cloud technologies.

---

## 🚀 Features

- REST API for managing words
- Hangman game logic
- Modular architecture (Controller, Service, Repository)
- Ready for Docker & Kubernetes deployment
- CI/CD pipeline (GitHub Actions)

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Maven
- Docker (optional)
- Kubernetes (optional)
- GitHub Actions (CI/CD)

---

## 📂 Project Structure
src/
├── main/
│ ├── java/com/example/adventurewords/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── model/
│ │ └── dto/
│ └── resources/
│ └── application.properties
├── test/


---

## ▶️ How to Run the Application

### Prerequisites

- Java 17+
- Maven

### Run locally

```bash
mvn clean spring-boot:run


Application will start on:

http://localhost:8081

🐳 (Optional) Docker
docker build -t adventurewords .
docker run -p 8081:8081 adventurewords
☸️ (Optional) Kubernetes

Apply configuration:

kubectl apply -f k8s/

🧪 Running Tests
  mvn test


📌 Roadmap
 Add PostgreSQL database
 Improve game logic
 Add authentication
 Improve CI/CD pipeline
 Deploy to cloud (AWS)

💻 Author

Created by Julie 
A journey of learning, building, and exploring :)

Goal

This project is part of a learning journey into:

Software Engineering
DevOps
Cloud & Kubernetes
Building real-world systems
