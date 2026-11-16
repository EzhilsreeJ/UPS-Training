
package com.example.LoginRegister.service;

import com.example.LoginRegister.entity.User;
import com.example.LoginRegister.dto.StudentResponse;
import com.example.LoginRegister.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    // Register Student
    public String register(User user) {

        if (userRepository.existsByEmailIgnoreCase(user.getEmail())) {
            return "Email already registered";
        }

        userRepository.save(user);

        return "Registration successful";
    }

    // Login Student
    public StudentResponse login(String email, String password) {

        User user = userRepository.findByEmailIgnoreCase(email)
                .orElse(null);

        if (user != null && user.getPassword().equals(password)) {

            return new StudentResponse(
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    user.getPhone()
            );
        }

        return null;
    }

    // Get All Students
    public List<StudentResponse> getUsers() {

        return userRepository.findAll()
                .stream()
                .map(user -> new StudentResponse(
                        user.getId(),
                        user.getName(),
                        user.getEmail(),
                        user.getPhone()
                ))
                .toList();
    }
}
