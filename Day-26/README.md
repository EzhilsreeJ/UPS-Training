# Day 26 – Student Registration and Login API

## Overview

A beginner-friendly student registration and login backend built using Java 21, Spring Boot, Spring Data JPA, Hibernate, and MySQL. The project is based on the supplied `LoginRegister.zip` source.

## Technologies Used

- Java 21
- Spring Boot 4.1.2
- Spring WebMVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Project Structure

```text
Day-26/
├── README.md
└── LoginRegister/
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── src/
        ├── main/
        │   ├── java/com/example/LoginRegister/
        │   │   ├── controller/AuthController.java
        │   │   ├── dto/StudentResponse.java
        │   │   ├── entity/User.java
        │   │   ├── repository/UserRepository.java
        │   │   ├── service/AuthService.java
        │   │   └── LoginRegisterApplication.java
        │   └── resources/application.properties
        └── test/
```

## Features

- Register a student and store the details in MySQL.
- Prevent registration when the email is already registered.
- Log in using email and password.
- Return student details through a response DTO without returning the password.
- Retrieve all registered students.
- Enable cross-origin requests from the configured local React development origins.

## REST API Endpoints

Base URL: `http://localhost:8080/students`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/register` | Register a new student |
| POST | `/login` | Authenticate a student |
| GET | `/` | Retrieve all registered students |

### Register – POST `/students/register`

Example request body:

```json
{
  "name": "Arun",
  "email": "arun@example.com",
  "password": "demo123",
  "phone": "9876543210"
}
```

Successful response: `Registration successful`

If the email already exists, the API responds with HTTP `409 Conflict` and `Email already registered`.

### Login – POST `/students/login`

Example request body:

```json
{
  "email": "arun@example.com",
  "password": "demo123"
}
```

Successful response example:

```json
{
  "id": 1,
  "name": "Arun",
  "email": "arun@example.com",
  "phone": "9876543210"
}
```

Invalid credentials return HTTP `401 Unauthorized`.

### Get All Students – GET `/students`

Returns a list of registered students with their ID, name, email, and phone number.

## Database Configuration

1. Start MySQL.
2. Create the database:

```sql
CREATE DATABASE student_db;
```

3. Configure the database username and password in `src/main/resources/application.properties`. The password is read from the `DB_PASSWORD` environment variable; set it before starting the application.

## Run the Application

1. Open the `LoginRegister` folder in IntelliJ IDEA.
2. Update the MySQL credentials / set the `DB_PASSWORD` environment variable.
3. Run `LoginRegisterApplication.java`.
4. The application starts at `http://localhost:8080`.
5. Test the endpoints using Postman.

Alternatively, run the project from a terminal in the `LoginRegister` folder:

```bash
./mvnw spring-boot:run
```

On Windows:

```bat
mvnw.cmd spring-boot:run
```

## Important Note

This is a training implementation. Passwords are currently stored and compared as plain text. Do not use this authentication approach in a production application; production systems must hash passwords and apply appropriate validation and security controls.

The supplied project contains backend source code only. No frontend application files were included in `LoginRegister.zip`.
