package com.ups.studentmanagement.service;

import com.ups.studentmanagement.dao.StudentDAO;
import com.ups.studentmanagement.model.Student;
import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO = new StudentDAO();

    public void addStudent(int id, String name) throws SQLException {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }

        Student student = new Student(id, name.trim());

        studentDAO.addStudent(student);
    }

    public void displayStudents() throws SQLException {

        List<Student> students = studentDAO.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n----- Student List -----");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void updateStudent(int id, String name) throws SQLException {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }

        studentDAO.updateStudent(id, name.trim());
    }

    public void deleteStudent(int id) throws SQLException {

        studentDAO.deleteStudent(id);
    }
}