package Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("1. add Employee without any details");
            System.out.println("2. add Employee with details");
            System.out.println("3. add Employee with bonus");
            System.out.println("4. Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    Employee E1= new Employee();
                    E1.DisplayDetails();
                    E1.finalize();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Id");
                    int Id=sc.nextInt();
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter Basic Salary:");
                    long Salary=sc.nextInt();
                    System.out.println("Enter TaxDeduction:");
                    long tax=sc.nextInt();
                    Employee E2=new Employee(Id,name,Salary,tax);
                    E2.DisplayDetails();
                    E2.finalize();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Id");
                    int Id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter Basic Salary:");
                    long Salary=sc.nextInt();
                    System.out.println("Enter TaxDeduction:");
                    long tax=sc.nextInt();
                    System.out.println("Enter Bonus:");
                    long bonus=sc.nextInt();
                    Employee E3=new Employee(Id,name,Salary,tax,bonus);
                    E3.DisplayDetails();
                    E3.finalize();
                    break;
                }
                default:{

                }
            }
        }while(choice!=4);
    }
}
