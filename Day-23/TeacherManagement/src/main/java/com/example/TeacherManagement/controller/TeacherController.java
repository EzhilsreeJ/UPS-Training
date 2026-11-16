package com.example.TeacherManagement.controller;

import com.example.TeacherManagement.entity.Teacher;
import com.example.TeacherManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService serv;

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher t) {
        return serv.addTeacher(t);
    }

    @GetMapping
    public List<Teacher> getTeachers() {
        return serv.getTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable Long id) {
        return serv.getTeacher(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        return serv.deleteTeacher(id);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher t) {
        return serv.updateTeacher(id, t);
    }
}