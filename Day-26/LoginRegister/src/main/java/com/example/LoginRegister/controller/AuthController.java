
package com.example.LoginRegister.controller;

import com.example.LoginRegister.entity.User;
import com.example.LoginRegister.service.AuthService;
import com.example.LoginRegister.dto.StudentResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://127.0.0.1:5173"
})
public class AuthController {

    @Autowired
    private AuthService authService;

    // Register Student
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {

        String result = authService.register(user);

        if (result.equals("Registration successful")) {
            return ResponseEntity.ok(result);
        }

        return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
    }

    // Login Student
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> data) {

        StudentResponse student = authService.login(
                data.get("email"),
                data.get("password")
        );

        if (student != null) {
            return ResponseEntity.ok(student);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid email or password");
    }

    // Get All Students
    @GetMapping
    public List<StudentResponse> getUsers() {

        return authService.getUsers();
    }
}
