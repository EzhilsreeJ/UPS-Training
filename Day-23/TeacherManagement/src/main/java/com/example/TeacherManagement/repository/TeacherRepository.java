package com.example.TeacherManagement.repository;
import com.example.TeacherManagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
