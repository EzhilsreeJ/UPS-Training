# Day 24 – Spring Boot Registration and Login API

## Overview

A beginner-friendly Spring Boot REST API for user registration and login. The project uses a layered structure with Controller, Service, Repository, Entity, and DTO components.

## Topics Covered

- Spring Boot project setup
- REST API development
- Layered architecture
- Entity and DTO classes
- Spring Data JPA and repository methods
- Service and controller layers
- MySQL database connectivity
- User registration and login
- Duplicate email checking
- Basic login credential validation
- Postman API testing

## Technologies

- Java 21
- Spring Boot 4.1.2 (as configured in `pom.xml`)
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## Project Structure

```text
Day-24/
├── README.md
└── demo/
    ├── src/
    │   ├── main/
    │   │   ├── java/com/example/demo/
    │   │   │   ├── controller/AuthController.java
    │   │   │   ├── dto/SignupDTO.java
    │   │   │   ├── entity/User.java
    │   │   │   ├── repository/UserRepository.java
    │   │   │   ├── service/AuthService.java
    │   │   │   └── DemoApplication.java
    │   │   └── resources/application.properties
    │   └── test/java/com/example/demo/DemoApplicationTests.java
    ├── .mvn/wrapper/maven-wrapper.properties
    ├── mvnw
    ├── mvnw.cmd
    └── pom.xml
```

## Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE testdb;
```

Update the MySQL username and password in `demo/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password. The project uses `update` to retain existing table data when the application restarts.

## API Endpoints

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/users` | Register a new user |
| POST | `/api/auth/login` | Log in with email and password |

### 1. Registration

**POST** `http://localhost:8080/users`

Body → raw → JSON:

```json
{
  "name": "Ezhil",
  "email": "ezhil@gmail.com",
  "password": "123456",
  "age": 21
}
```

The API checks whether the email is already registered. If it exists, it returns `400 Bad Request` with an error message.

### 2. Login

**POST** `http://localhost:8080/api/auth/login`

Body → raw → JSON:

```json
{
  "email": "ezhil@gmail.com",
  "password": "123456"
}
```

The API checks whether the email exists and whether the supplied password matches the stored password.

## Run the Application

1. Open the `demo` folder in IntelliJ IDEA or another Java IDE.
2. Configure JDK 21.
3. Start MySQL and create the `testdb` database.
4. Set your MySQL password in `application.properties`.
5. Run `DemoApplication.java`.
6. The server starts at `http://localhost:8080`.
7. Test both endpoints using Postman.

You can also run the project from a terminal inside `demo`:

Windows:

```bash
mvnw.cmd spring-boot:run
```

macOS/Linux:

```bash
./mvnw spring-boot:run
```

## Important Note

This is a learning project. Passwords are currently stored as plain text, and the registration endpoint returns the saved user entity. Do not use this implementation with real user credentials or deploy it publicly without adding password hashing and a response DTO that excludes the password.
