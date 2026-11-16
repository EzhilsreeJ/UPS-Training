package com.example.RoleBased.controller;

import com.example.RoleBased.entity.Teacher;
import com.example.RoleBased.entity.Student;
import com.example.RoleBased.service.TeacherService;
import com.example.RoleBased.service.StudentService;

import jakarta.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class TeacherController {

    private final TeacherService teacherService;
    private final StudentService studentService;

    public TeacherController(
            TeacherService teacherService,
            StudentService studentService) {

        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    // Teacher Login
    @PostMapping("/login")
    public ResponseEntity<?> teacherLogin(
            @RequestBody Teacher teacher,
            HttpSession session) {

        try {
            Teacher existingTeacher =
                    teacherService.getTeacherByEmail(teacher.getEmail());

            if (existingTeacher.getPassword().equals(teacher.getPassword())) {

                session.setAttribute("teacherId", existingTeacher.getId());
                session.setAttribute("role", "TEACHER");

                existingTeacher.setPassword(null);

                return ResponseEntity.ok(existingTeacher);
            }

            return ResponseEntity.status(401)
                    .body("Invalid email or password");

        } catch (RuntimeException e) {
            return ResponseEntity.status(401)
                    .body("Invalid email or password");
        }
    }

    // Teacher View Own Profile
    @GetMapping("/my-profile")
    public ResponseEntity<?> getMyProfile(HttpSession session) {

        if (!"TEACHER".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403)
                    .body("Teacher access required");
        }

        Long teacherId = (Long) session.getAttribute("teacherId");

        Teacher teacher = teacherService.getTeacherById(teacherId);
        teacher.setPassword(null);

        return ResponseEntity.ok(teacher);
    }

    // Teacher Add Student
    @PostMapping("/students")
    public ResponseEntity<?> addStudent(
            @RequestBody Student student,
            HttpSession session) {

        if (!"TEACHER".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403)
                    .body("Teacher access required");
        }

        try {
            student.setId(null);
            Student savedStudent = studentService.registerStudent(student);

            savedStudent.setPassword(null);

            return ResponseEntity.ok(savedStudent);

        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Teacher View All Students
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(HttpSession session) {

        if (!"TEACHER".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403)
                    .body("Teacher access required");
        }

        List<Student> students = studentService.getAllStudents();

        students.forEach(student -> student.setPassword(null));

        return ResponseEntity.ok(students);
    }

    // Teacher View Student By ID
    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudentById(
            @PathVariable Long id,
            HttpSession session) {

        if (!"TEACHER".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403)
                    .body("Teacher access required");
        }

        try {
            Student student = studentService.getStudentById(id);
            student.setPassword(null);

            return ResponseEntity.ok(student);

        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Teacher Delete Student
    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudent(
            @PathVariable Long id,
            HttpSession session) {

        if (!"TEACHER".equals(session.getAttribute("role"))) {
            return ResponseEntity.status(403)
                    .body("Teacher access required");
        }

        try {
            studentService.deleteStudent(id);

            return ResponseEntity.ok("Student deleted successfully");

        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Teacher Logout
    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {

        session.invalidate();

        return ResponseEntity.ok("Teacher logged out successfully");
    }
}