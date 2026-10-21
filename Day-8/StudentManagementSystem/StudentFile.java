package StudentManagementSystem;
import java.io.*;

public class StudentFile {
    String fileName = "students.txt";

    public StudentFile() {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Student file created.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }

    public void createStudent(Student s) {
        try {
            PrintWriter writer = new PrintWriter(
                new FileWriter(fileName, true)
            );

            writer.println(s.getId() + "," + s.getName() + ","
                    + s.getDept() + "," + s.getYear());

            writer.close();
            System.out.println("Student added successfully.");

        } catch (IOException e) {
            System.out.println("Error saving student.");
        }
    }

    public void readStudents() {
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
            );

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("ID: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Department: " + data[2]);
                System.out.println("Year: " + data[3]);
                System.out.println("--------------------");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading student records.");
        }
    }

    public void deleteStudent(int id) {
        try {
            File file = new File(fileName);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(
                new FileReader(file)
            );

            PrintWriter writer = new PrintWriter(
                new FileWriter(tempFile)
            );

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == id) {
                    found = true;
                } else {
                    writer.println(line);
                }
            }

            reader.close();
            writer.close();

            if (found) {
                if (file.delete()) {
                    tempFile.renameTo(file);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Could not update student file.");
                }
            } else {
                tempFile.delete();
                System.out.println("Student ID not found.");
            }

        } catch (IOException e) {
            System.out.println("Error deleting student.");
        }
    }
}
