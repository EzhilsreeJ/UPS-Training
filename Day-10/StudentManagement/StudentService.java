import java.util.*;
import java.time.format.DateTimeFormatter;
public class StudentService {
    Scanner sc = new Scanner(System.in);
    StudentFile file = new StudentFile();
    ArrayList<Student> students = new ArrayList<>();
    
public void addStudent() {
    System.out.print("Enter student ID: ");
    int id = sc.nextInt();
    sc.nextLine(); 

    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter department: ");
    String dept = sc.nextLine();

    System.out.print("Enter year: ");
    int year = sc.nextInt();

    Student s = new Student(id, name, dept, year);
    students.add(s);
    file.createStudent(s);

    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    // System.out.println("Student added successfully!");
    System.out.println("Added Time: " + s.getAddedTime().format(format));
}

    public void viewStudents() {
        // file.readStudents();
        System.out.println("ID\tName\tDepartment\tYear\tAdded Time");
        for (Student s : students) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getDept() + "\t" + s.getYear() + "\t" + s.getAddedTime());
        }
        // System.out.println(students);
        
    }

    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        file.deleteStudent(id);
    }
}
