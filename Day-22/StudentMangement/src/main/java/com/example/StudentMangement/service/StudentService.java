package com.example.StudentMangement.service;

import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}