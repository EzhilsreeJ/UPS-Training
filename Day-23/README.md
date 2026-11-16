# Day 23 – Teacher Management API

## Overview

Developed a **Teacher Management REST API** using Spring Boot to manage teacher records. The application supports creating, retrieving, updating, and deleting teacher details through RESTful endpoints.

## Topics Covered

- Spring Boot Project Setup
- REST API Development
- Entity Creation using JPA
- Repository Layer using `JpaRepository`
- Service Layer Implementation
- Controller Layer Implementation
- MySQL Database Connectivity
- CRUD Operations
- HTTP Methods: GET, POST, PUT, DELETE
- Request Body and Path Variables
- API Testing using Postman

## Technologies Used

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven
- Postman

## Project Structure

```text
Day-23/
└── TeacherManagement/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/example/TeacherManagement/
    │   │   │       ├── controller/
    │   │   │       │   └── TeacherController.java
    │   │   │       ├── entity/
    │   │   │       │   └── Teacher.java
    │   │   │       ├── repository/
    │   │   │       │   └── TeacherRepository.java
    │   │   │       ├── service/
    │   │   │       │   └── TeacherService.java
    │   │   │       └── TeacherManagementApplication.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    ├── pom.xml
    ├── mvnw
    └── mvnw.cmd
```

## Teacher Entity

The Teacher entity contains the following fields:

| Field | Data Type |
|---|---|
| id | Long |
| name | String |
| depart | String |
| email | String |
| salary | double |

## API Endpoints

**Base URL:** `http://localhost:8080/teachers`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/teachers` | Create a new teacher |
| GET | `/teachers` | Retrieve all teachers |
| GET | `/teachers/{id}` | Retrieve a teacher by ID |
| PUT | `/teachers/{id}` | Update an existing teacher |
| DELETE | `/teachers/{id}` | Delete a teacher by ID |

## Example JSON Payload

```json
{
    "name": "Aakash",
    "depart": "Computer Science",
    "email": "aakash@gmail.com",
    "salary": 45000
}
```

## Database Configuration

**Database:** `teacherdb`

The database connection is configured in `src/main/resources/application.properties`.

```properties
spring.application.name=TeacherManagement

spring.datasource.url=jdbc:mysql://localhost:3306/teacherdb
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Create the database in MySQL:

```sql
CREATE DATABASE teacherdb;
```

## Application Layers

| Layer | Responsibility |
|---|---|
| Entity | Defines teacher details |
| Repository | Performs database operations using JpaRepository |
| Service | Contains business logic |
| Controller | Handles REST API requests |

## Running the Application

1. Import the project into IntelliJ IDEA, Eclipse, or VS Code.
2. Ensure JDK 21 is configured.
3. Start the MySQL server.
4. Create the `teacherdb` database.
5. Update the MySQL username and password in `application.properties`.
6. Run `TeacherManagementApplication.java`.
7. The application starts at `http://localhost:8080`.
8. Test the API endpoints using Postman.

## Learning Outcomes

- Understood Spring Boot application architecture.
- Learned to build RESTful APIs.
- Practised implementing CRUD operations.
- Used Spring Data JPA for database interactions.
- Connected Spring Boot with MySQL.
- Understood the differences between GET, POST, PUT, and DELETE.
- Tested REST API endpoints using Postman.

---

**Day 23 completed – Teacher Management REST API using Spring Boot and MySQL.**