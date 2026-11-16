package com.example.TeacherManagement.service;

import com.example.TeacherManagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.TeacherManagement.entity.Teacher;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository repo;

    public Teacher addTeacher(Teacher t) {
        return repo.save(t);
    }

    public List<Teacher> getTeachers() {
        return repo.findAll();
    }

    public Teacher getTeacher(Long id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteTeacher(Long id) {
        repo.deleteById(id);
        return "Teacher deleted successfully";
    }
    public Teacher updateTeacher(Long id, Teacher t) {
        Teacher old = repo.findById(id).orElse(null);

        if (old != null) {
            old.setName(t.getName());
            old.setDepart(t.getDepart());
            old.setEmail(t.getEmail());
            old.setSalary(t.getSalary());

            return repo.save(old);
        }

        return null;
    }

}
