# Day 22 – Student Management System using Spring Boot

## Overview

Developed a basic **Student Management System** using Spring Boot, Spring Data JPA, and MySQL. This project demonstrates how to create REST APIs and perform CRUD operations by connecting a Spring Boot application to a MySQL database.

## Topics Covered

- Spring Boot Project Setup
- Spring Web and REST API Development
- Entity Creation using JPA
- Repository Layer using `JpaRepository`
- Service Layer Implementation
- Controller Layer Implementation
- MySQL Database Connectivity
- CRUD Operations
- HTTP Methods: GET, POST, DELETE
- Testing REST APIs

## Technologies Used

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven
- Lombok

## Project Structure

```text
Day-22/
└── StudentMangement/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/example/StudentMangement/
    │   │   │       ├── controller/
    │   │   │       │   └── StudentController.java
    │   │   │       ├── entity/
    │   │   │       │   └── Student.java
    │   │   │       ├── repository/
    │   │   │       │   └── StudentRepository.java
    │   │   │       ├── service/
    │   │   │       │   └── StudentService.java
    │   │   │       └── StudentMangementApplication.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    ├── pom.xml
    ├── mvnw
    └── mvnw.cmd
```

## Application Layers

| Layer | Responsibility |
|---|---|
| Entity | Defines the Student entity and its fields |
| Repository | Handles database operations using JpaRepository |
| Service | Contains the business logic |
| Controller | Handles HTTP requests and API responses |

## Student Entity

The Student entity contains the following fields:

| Field | Data Type |
|---|---|
| id | Long |
| name | String |
| department | String |
| age | int |

## REST API Endpoints

Base URL: `http://localhost:8080/students`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add a new student |
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| DELETE | `/students/{id}` | Delete a student by ID |

## Database Configuration

Database: `studentmanagement`

The database connection is configured in `src/main/resources/application.properties`.

```properties
spring.application.name=StudentMangement
spring.datasource.url=jdbc:mysql://localhost:3306/studentmanagement
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password.

Create the database before running the application:

```sql
CREATE DATABASE studentmanagement;
```

## How to Run the Project

1. Open the `StudentMangement` project in IntelliJ IDEA or your preferred Java IDE.
2. Start your MySQL server.
3. Create the `studentmanagement` database.
4. Update the MySQL username and password in `application.properties`.
5. Run `StudentMangementApplication.java`.
6. Test the REST APIs using Postman.

## Learning Outcome

- Understood the layered architecture of a Spring Boot application.
- Learned to create REST APIs using Spring Web MVC.
- Implemented database operations using Spring Data JPA.
- Connected a Spring Boot application with MySQL.
- Practised GET, POST, and DELETE HTTP methods.

---

**Day 22 completed – Building REST APIs with Spring Boot and MySQL.**