# AdventureWords

AdventureWords is a minimal web application inspired by the Hangman game, built with Spring Boot.

The project is designed as a learning exercise for building a simple Java web application and later extending it with containerization and cloud-native deployment.

---

## Tech Stack

- Java
- Spring Boot
- Thymeleaf
- Maven

---

## Project Structure


adventurewords
│
├── .gitignore
├── README.md
├── pom.xml
│
└── src
└── main
├── java/com/example/adventurewords
│ ├── AdventurewordsApplication.java
│ ├── controller/GameController.java
│ └── service/HangmanService.java
│
└── resources
├── templates/index.html
└── application.properties


---

## Getting Started

### Prerequisites

- Java 17+
- Maven 3+

### Run the application

Clone the repository:


git clone https://github.com/your-username/adventurewords.git

cd adventurewords


Start the application:


mvn spring-boot:run


Open your browser:


http://localhost:8081


---

## Future Improvements

This project will be extended with:

- Docker containerization
- Kubernetes deployment
- CI/CD pipeline
