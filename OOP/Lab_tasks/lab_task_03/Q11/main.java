package Q11;

import java.util.*;
public class main {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int cho;
        do {
            System.out.println("Student system (Karachi campus)");
            System.out.println("1. New Student");
            System.out.println("2. Update Student Name");
            System.out.println("3. Remove student");
            System.out.println("4. Current list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            cho = scanner.nextInt();
            scanner.nextLine();
            switch (cho) {
                case 1:
                    System.out.print("Enter new student name: ");

                    String newStudent = scanner.nextLine();

                    student.add(newStudent);

                    break;
                case 2:
                    System.out.print("Enter student name: ");

                    String currentname = scanner.nextLine();

                    if (student.contains(currentname)) {
                        System.out.print("Enter updated name: ");

                        String updatedname = scanner.nextLine();

                        student.set(student.indexOf(currentname), updatedname);
                    } else {

                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to remove: ");

                    String cancel = scanner.nextLine();
                    if (student.contains(cancel)) {

                        student.remove(cancel);

                    } else {
                        System.out.println("Student not found.");
                    }

                    break;
                case 4:
                    System.out.println("Current list:");

                    for (String students : student) {

                        System.out.println(students);
                    }
                    break;
                case 5:
                    System.out.println("Exiting system.");

                    break;
                default:
                    System.out.println("Invalid choice. Try again.");

            }
        } while (cho != 5);
    }
}
