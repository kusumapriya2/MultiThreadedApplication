# MultiThreadedApplication
# Multi-Threaded Chat Application - Spring Boot

This project is a **Multi-Threaded Chat Application** built using **Java Spring Boot**. It provides a real-time messaging system and leverages multithreading for efficient processing of concurrent requests.

The application uses **H2 in-memory database** for storing user data and messages, and is developed in **Spring Tool Suite (STS)**.

---

## Features

- **Multi-threaded processing**: Efficient handling of simultaneous user requests using Spring's built-in support for multithreading.
- **User Management**: Registration and login system.
- **Real-time Chat**: Send and receive messages.
- **H2 Database Console**: Inspect the database directly.
- **Spring Tool Suite Integration**: Import, run, and debug with ease.

---

## Prerequisites

1. **Java**: Ensure you have JDK 17+ installed.
2. **Spring Tool Suite (STS)**: Download and install from [Spring Tool Suite](https://spring.io/tools).
3. **Maven**: Should be configured (bundled with STS).
4. **Web Browser**: For accessing the H2 console and application frontend.

---

## Installation and Setup

### 1. Clone the Repository
```bash
git clone https://github.com/your-repo/chat-application.git
cd chat-application
2. Import into Spring Tool Suite
Open Spring Tool Suite.
Navigate to File -> Import -> Maven -> Existing Maven Projects.
Select the project directory and click Finish.
3. Configure Application Properties
Open src/main/resources/application.properties and ensure the following configurations are set:

properties
Copy code
# Server settings
server.port=8080

# H2 Database settings
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:chatapp
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Logging
logging.level.org.springframework=INFO

# Thread pool configuration
spring.task.execution.pool.core-size=5
spring.task.execution.pool.max-size=10
spring.task.execution.pool.queue-capacity=100
4. Run the Application
Right-click on the project in STS.
Select Run As -> Spring Boot App.
