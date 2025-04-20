package Q4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> studentPermissions = new ArrayList<>(Arrays.asList("Submit Assignment"));
        ArrayList<String> taPermissions = new ArrayList<>(Arrays.asList("View Projects", "Manage Students"));
        ArrayList<String> profPermissions = new ArrayList<>(Arrays.asList("Assign Projects", "accessLab"));


        ArrayList<String> assignments = new ArrayList<>(Arrays.asList("Math Homework", "Science Project", "Essay"));


        Student student1 = new Student("Syed Arham", 1001, studentPermissions, "syeddarham123@nu.edu.pk", "student123", assignments);
        TA ta1 = new TA("Malik Xaryab", 2001, taPermissions, "xaryabawan21@nu.edu.pk", "ta456", new ArrayList<>(), 0);
        Professor prof1 = new Professor("Sir Minahl raza", 3001, profPermissions, "minhalraza14@nu.edu.pk", "prof789");


        System.out.println("===Student Operations =====");
        student1.displayInfo();
        student1.displayAssignment(assignments);
        student1.submitAssignment(assignments);

        System.out.println("\n===== TA Operations =====");
        ta1.displayInfo();
        ta1.assingStudent(student1);
        ta1.workWithProfessor(1);

        System.out.println("\n===== Professor Operations =====");
        prof1.displayDetails();
        prof1.workOnTAProjects(ta1);
        prof1.assignProjects("Research Project", ta1);

        System.out.println("\n===== Authentication Test =====");
        System.out.println("Student authentication (correct password): " + student1.authenticate("student123"));
        System.out.println("Student authentication (wrong password): " + student1.authenticate("wrongpass"));
        
        System.out.println("\n===== Lab Access Test =====");
        System.out.print("Student lab access: ");
        student1.accessLab(studentPermissions);
        System.out.print("TA lab access: ");
        ta1.accessLab(taPermissions);
    }
}