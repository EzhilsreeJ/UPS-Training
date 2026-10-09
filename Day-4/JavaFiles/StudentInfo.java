import java.util.*;
class Student {
    Scanner sc= new Scanner(System.in);
    String name;
    int age;
    Long mobile;

    void createStudent(){
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter mobile: ");
        mobile = sc.nextLong();
    }
    void display(){
        System.out.println("Student name is "+name + ",age is " + age + " and mobile number is " + mobile);
    }
}

public class StudentInfo{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.createStudent();
        s1.display();

        s2.createStudent();
        s2.display();

        s3.createStudent();
        s3.display();
    }
}
