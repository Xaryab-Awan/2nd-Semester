package Q4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentPermissions = new ArrayList<>(Arrays.asList("SubmitAssignment"));
        ArrayList<String> taPermissions = new ArrayList<>(Arrays.asList("ViewProjects", "ManageStudents"));
        ArrayList<String> profPermissions = new ArrayList<>(Arrays.asList("AssignProjects", "accessLab"));


        ArrayList<String> assignments = new ArrayList<>(Arrays.asList("Math ", "Science", "Essay"));
        Student S1=new Student("Xaryab",3055,studentPermissions,"k243055@nu.edu.pk","xaryab");
        TA t1=new TA("Arham",2551,taPermissions,"k242551@nu.edu.pk","arham",new ArrayList<>());
        Professor P1=new Professor("Rafay",3007,profPermissions,"k243007@nu.edu.pk","rafay");


        System.out.println("tudent Operations ");
        S1.Display_details();
        S1.displayAssignment();


        System.out.println("\nTA Operations ");
        t1.Display_details();
        t1.assignStudent(S1);
        t1.workWithProfessor("1");

        System.out.println("\n Professor Operations");
        P1.Display_details();
        P1.workOnTAProjects(t1);
        P1.assignProjects("Research Project", t1);

        System.out.println("\n Authentication Test ");
        System.out.println("Student authentication (correct password): " + S1.authenticate("student123"));
        System.out.println("Student authentication (wrong password): " + S1.authenticate("wrongpass"));

        System.out.println("\n===== Lab Access Test =====");
        System.out.print("Student lab access: ");
        S1.Access_lab();
        System.out.print("TA lab access: ");
        t1.Access_lab();
    }
}
