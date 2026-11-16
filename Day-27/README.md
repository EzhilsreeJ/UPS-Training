# Day 27 – Login and Role-Based Student Management

## Topics Covered
- Student login using email and password
- Teacher login using email and password
- Session-based login state using `HttpSession`
- Role identification using `STUDENT` and `TEACHER`
- Student and teacher profile access
- Logout and session invalidation
- Teacher task: add, view, search by ID, and delete students
- Role checks before accessing protected endpoints
- REST API testing using Postman

## Technologies
- Java 21
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Spring Security configuration
- MySQL
- Maven

## Project Structure

```text
NewRoleBased/
├── src/main/java/com/example/RoleBased/
│   ├── config/
│   │   └── SecurityConfig.java
│   ├── controller/
│   │   ├── StudentController.java
│   │   └── TeacherController.java
│   ├── entity/
│   │   ├── Student.java
│   │   └── Teacher.java
│   ├── repository/
│   │   ├── StudentRepository.java
│   │   └── TeacherRepository.java
│   ├── service/
│   │   ├── StudentService.java
│   │   └── TeacherService.java
│   └── RoleBasedApplication.java
└── src/main/resources/
    └── application.properties
```

## Database Configuration

Create the database in MySQL:

```sql
CREATE DATABASE rolebased_db;
```

Update `src/main/resources/application.properties` with your MySQL credentials. The password is read from the `DB_PASSWORD` environment variable, with a placeholder fallback:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rolebased_db
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD:your_mysql_password}
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

Set `DB_PASSWORD` to your actual MySQL password before running the application.

## API Endpoints

Base URL: `http://localhost:8080`

### Student APIs

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/api/students/register` | Register a student |
| POST | `/api/students/login` | Student login |
| GET | `/api/students/my-profile` | View logged-in student's profile |
| POST | `/api/students/logout` | Student logout |

Student registration request example:

```json
{
  "name": "Arun",
  "email": "arun@example.com",
  "password": "student123",
  "department": "CSE",
  "phone": "9876543210"
}
```

Student login request:

```json
{
  "email": "arun@example.com",
  "password": "student123"
}
```

### Teacher APIs

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/api/teachers/login` | Teacher login |
| GET | `/api/teachers/my-profile` | View logged-in teacher's profile |
| POST | `/api/teachers/students` | Add a student |
| GET | `/api/teachers/students` | View all students |
| GET | `/api/teachers/students/{id}` | View a student by ID |
| DELETE | `/api/teachers/students/{id}` | Delete a student |
| POST | `/api/teachers/logout` | Teacher logout |

Teacher login request:

```json
{
  "email": "teacher@example.com",
  "password": "teacher123"
}
```

Teacher add-student request uses the same student fields as the registration example.

## Session and Role Handling

- On successful student login, the application stores `studentId` and the `STUDENT` role in the HTTP session.
- On successful teacher login, it stores `teacherId` and the `TEACHER` role.
- Student profile access checks for the `STUDENT` role.
- Teacher profile and student-management endpoints check for the `TEACHER` role.
- Logout invalidates the current session.
- For browser-based frontend requests, the backend enables credentialed CORS for `http://localhost:5173`.

For Postman testing, keep the session cookie returned by the login request and send it with subsequent profile or teacher-task requests.

## Run the Application

1. Open the `NewRoleBased` project in IntelliJ IDEA.
2. Configure the MySQL database and `DB_PASSWORD`.
3. Wait for Maven dependencies to load.
4. Run `RoleBasedApplication.java`.
5. Test the endpoints using Postman.

## Important Implementation Note

This project compares the submitted password directly with the stored password. Passwords are not hashed. This is a learning implementation and should not be used as-is in production. The `SecurityConfig` currently permits all HTTP requests at the Spring Security filter level; role checks are performed manually in the controller methods.

---
**Day 27: Student and Teacher Login, Session Handling, Role-Based Access, and Teacher Student-Management Task.**
