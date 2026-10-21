package StudentManagementSystem;
import java.util.*;

public class StudentService {
    Scanner sc = new Scanner(System.in);
    StudentFile file = new StudentFile();

    public void addStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        System.out.print("\nEnter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        Student s = new Student(id, name, dept, year);
        file.createStudent(s);

        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        file.readStudents();
    }

    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        file.deleteStudent(id);
    }
}
