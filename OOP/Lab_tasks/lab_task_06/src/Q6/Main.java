package Q6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Employee Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Salary:");
        int salary = sc.nextInt();
        Employee e1=new Employee(name,id,salary);
        sc.nextLine();
        System.out.println("Enter Developer Name:");
        name = sc.nextLine();
        System.out.println("Enter Developer ID:");
        id = sc.nextInt();
        System.out.println("Enter Developer Salary:");
        salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Programming Language:");
        String programming_language = sc.nextLine();
        Developer d1=new Developer(name,id,salary,programming_language);
        System.out.println("Enter Software Architect name:");
        name = sc.nextLine();
        System.out.println("Enter Software Architect ID:");
        id = sc.nextInt();
        System.out.println("Enter Software Architect Salary:");
        salary = sc.nextInt();
        int project_count = 0;
        System.out.println("Enter Project Count:");
        project_count = sc.nextInt();
        SoftwareArchitect s1=new SoftwareArchitect(name,id,salary,programming_language,project_count);
        e1.Employee_details();
        d1.Check();
        d1.DeveloperDetails();
        s1.Eligibility();
        s1.SoftwareArchitect_Details();
    }
}
