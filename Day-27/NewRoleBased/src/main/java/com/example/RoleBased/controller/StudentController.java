package com.example.RoleBased.controller;

import com.example.RoleBased.entity.Student;
import com.example.RoleBased.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerStudent(@RequestBody Student student) {

        Student savedStudent = studentService.addStudent(student);

        return ResponseEntity.ok("Student registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> studentLogin(
            @RequestBody Student student,
            HttpSession session) {

        Student existingStudent =
                studentService.getStudentByEmail(student.getEmail());

        if (existingStudent.getPassword().equals(student.getPassword())) {

            session.setAttribute("studentId", existingStudent.getId());
            session.setAttribute("role", "STUDENT");

            existingStudent.setPassword(null);

            return ResponseEntity.ok(existingStudent);
        }

        return ResponseEntity.status(401).body("Invalid email or password");
    }

    @GetMapping("/my-profile")
    public ResponseEntity<?> getMyProfile(HttpSession session) {

        if (!"STUDENT".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403).body("Student access required");
        }

        Long studentId = (Long) session.getAttribute("studentId");

        Student student = studentService.getStudentById(studentId);
        student.setPassword(null);

        return ResponseEntity.ok(student);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {

        session.invalidate();

        return ResponseEntity.ok("Logged out successfully");
    }
}