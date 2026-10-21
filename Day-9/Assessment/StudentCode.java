
class Student {
    String name;
    int total;
    double avg;
    char grade;

    Student(String name, int a, int b, int c, int d, int e) {
        this.name = name;
        total = a + b + c + d + e;
        avg = total / 5.0;

        if (avg >= 90) grade = 'A';
        else if (avg >= 75) grade = 'B';
        else if (avg >= 60) grade = 'C';
        else if (avg >= 40) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println(name + " | Total: " + total
                + " | Average: " + avg + " | Grade: " + grade);
    }
}

public class StudentCode {
    public static void main(String[] args) {
        Student[] s = {
            new Student("Arun", 85, 90, 80, 88, 82),
            new Student("Priya", 95, 96, 91, 90, 98),
            new Student("Ravi", 70, 75, 80, 65, 72)
        };

        Student topper = s[0];

        for (Student x : s) {
            x.display();
            if (x.total > topper.total)
                topper = x;
        }

        System.out.println("Topper: " + topper.name);
    }
}
