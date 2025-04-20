package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course("OOPs","CS1001", Arrays.asList("MINHAL RAZA","MUHAMMAD NADEEM"));
        Course c2=new Course("calculus","MT1001",Arrays.asList("Alishba Tariq","Urooj"));

        Student S1=new Student("Abdulrafay","24K-3007");
        Student S2=new Student("Xaryab","24K-3055");
        Student S3=new Student("Arham","24K-2551");
        Student S4=new Student("saad","3074");

        Assignment A1=new Assignment("Assignment 1","23/02/2025");
        Assignment A2=new Assignment("Assignment 2","02/03/2025");

        c1.addAssighmnet(A1);
        c2.addAssighmnet(A2);

        S1.enrollInCourse(c1);
        S1.enrollInCourse(c2);
        S2.enrollInCourse(c1);
        S2.enrollInCourse(c2);
        S3.enrollInCourse(c1);
        S3.enrollInCourse(c2);
        S4.enrollInCourse(c2);

        S1.completeAssignment(c1);
        S3.completeAssignment(c1);

        S1.displayStudentDetails();
        S2.displayStudentDetails();
        S3.displayStudentDetails();
        S4.displayStudentDetails();
    }
}
