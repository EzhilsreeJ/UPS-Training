package JavaFiles;

import java.io.IOException;

public class ExceptionHandling {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }

    static void readFile() throws IOException {
        throw new IOException("File could not be read");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
