package com.ups.studentmanagement.app;

import com.ups.studentmanagement.service.StudentService;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        try {
            do {
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        service.addStudent(id, name);
                        break;

                    case 2:
                        service.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        service.updateStudent(updateId, newName);
                        break;

                    case 4:
                        System.out.print("Enter Student ID: ");
                        int deleteId = sc.nextInt();

                        service.deleteStudent(deleteId);
                        break;

                    case 5:
                        System.out.println("Thank you for using the application!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } while (choice != 5);

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number!");

        } finally {
            sc.close();
        }
    }
}