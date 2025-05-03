package Q5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Confidential.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your designation (Faculty/Student): ");
            String designation = scanner.nextLine().trim();
            if (designation.equalsIgnoreCase("Faculty")) {
                file.setReadable(true);
                file.setWritable(true);
                file.setExecutable(true);
            } else if (designation.equalsIgnoreCase("Student")) {
                file.setReadable(true);
                file.setWritable(false);
                file.setExecutable(false);
            } else {
                System.out.println("Invalid designation. Program terminated.");
                scanner.close();
                return;
            }

            System.out.println("\nAccess Rights for 'Confidential.txt':");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());

            scanner.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
