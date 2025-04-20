package Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("PROCOM 25");
        ArrayList<String> a= new ArrayList<>();
        a.add("C++");
        a.add("Java");
        a.add("Python");
        ArrayList<String> b = new ArrayList<>();
        b.add("Machine Learning");
        b.add("Python");
        b.add("Sql");
        Company C1= new Company("Systems Limited","Software House","freshie",a);
        Company C2=new Company("Folio3","Software House","freshie",b);
        ArrayList<String> S1 = new ArrayList<>();
        S1.add("C++");
        S1.add("Java");
        S1.add("Python");
        ArrayList<String> S2 = new ArrayList<>();
        S2.add("Machine Learning");
        S2.add("Php");
        S2.add("Sql");
        ArrayList<String> S3 = new ArrayList<>();
        S3.add("Machine Learning");
        S3.add("Python");
        S3.add("java");
        Student s1=new Student("ali",S1);
        Student s2=new Student("xaryab",S2);
        Student s3=new Student("eshaal",S3);
        C1.ScheduleInterview(s1);
        C1.ScheduleInterview(s2);
        C1.ScheduleInterview(s3);

        C1.DisplayDetails();
        C2.DisplayDetails();



    }
}
