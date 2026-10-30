package com.ups.studentmanagement.dao;

import com.ups.studentmanagement.config.DatabaseConnection;
import com.ups.studentmanagement.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // CREATE - Add a student
    public void addStudent(Student student) throws SQLException {

        String query = "insert into student values (?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());

            ps.executeUpdate();

            System.out.println("Student added successfully!");
        }
    }

    // READ - Display all students
    public List<Student> getAllStudents() throws SQLException {

        List<Student> students = new ArrayList<>();

        String query = "select * from student";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Student student = new Student(
                    rs.getInt("id"),
                    rs.getString("name")
                );

                students.add(student);
            }
        }

        return students;
    }

    // UPDATE - Update student name
    public void updateStudent(int id, String name) throws SQLException {

        String query = "update student set name = ? where id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student ID not found!");
            }
        }
    }

    // DELETE - Delete a student
    public void deleteStudent(int id) throws SQLException {

        String query = "delete from student where id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student ID not found!");
            }
        }
    }
}