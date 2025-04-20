package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Xaryab", 3055,3000,"SoftwareEngineering");
        Employee emp2 = new Employee("Rafay",3007,2200,"ComputerScience");
        Employee emp3 = new Employee("Arham",2551,1900,"DataScience");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1) Display all employees:");
        System.out.println("2) Search for employee for a specific department:");
        choice = sc.nextInt();
        Boolean found = false;
        switch(choice){
            case 1:
            {
             for(Employee emp : employees){
                 emp.Display_Details();

             }
                break;
            }
            case 2:
            {
                System.out.println("Enter the name of the department: ");
                String department = sc.next();
                for(Employee e : employees){
                    if(department.equalsIgnoreCase(e.getDepartment())){
                        e.Display_Details();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Employee not found");
                }
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }

    }
}
