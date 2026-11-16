package com.example.StudentMapper.repository;

import com.example.StudentMapper.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
