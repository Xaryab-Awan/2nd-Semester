package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course("OOPs","CS1001", Arrays.asList("MINHAL RAZA","MUHAMMAD NADEEM"));
        Course c2=new Course("calculus","MT1001",Arrays.asList("Alishba Tariq","Urooj"));

        Student S1=new Student("Abdulrafay","24K-3007");
        Student S2=new Student("Xaryab","24K-3055");
        Student S3=new Student("Bisma","24K-3012");
        Student S4=new Student("Sara","XXXXXX");

        Assighment A1=new Assighment("Assighment 1","23/02/2025");
        Assighment A2=new Assighment("Assighment 1","02/03/2025");

        c1.addAssighmnet(A1);
        c2.addAssighmnet(A2);

        S1.enrollInCourse(c1);
        S1.enrollInCourse(c2);
        S2.enrollInCourse(c1);
        S2.enrollInCourse(c2);
        S3.enrollInCourse(c1);
        S3.enrollInCourse(c2);
        S4.enrollInCourse(c2);

        S1.completeAssighment(c1);
        S3.completeAssighment(c1);

        S1.Display();
        S2.Display();
        S3.Display();
        S4.Display();
    }
}
