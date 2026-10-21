package JavaFiles;

import java.io.File;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("test.txt");

        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Exists: " + file.exists());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
    }
}
