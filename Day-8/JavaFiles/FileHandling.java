package JavaFiles;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try {
            File file = new File(fileName);

            // Create file
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }

            // Write to file
            try (FileWriter fw = new FileWriter(fileName)) {
                fw.write("Hello Java\n");
                fw.write("File handling example\n");
            }

            // Read file using FileReader and BufferedReader
            StringBuilder content = new StringBuilder();

            try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {
                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    content.append(line.replace("Java", "World"))
                           .append(System.lineSeparator());
                }
            }

            // Edit file content
            try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(fileName))) {
                bw.write(content.toString());
            }

            // Append content using PrintWriter
            try (PrintWriter pw =
                     new PrintWriter(new FileWriter(fileName, true))) {
                pw.println("New content appended.");
            }

            // Display final content
            System.out.println("\nFinal file content:");

            try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {
                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // Uncomment the following line to delete the file
            // System.out.println(file.delete()
            //     ? "File deleted." : "File not deleted.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
