package Q7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Folio Projects Creating ......");
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("1. Default Project");
            System.out.println("2. Project with Name and Deadline");
            System.out.println("3. Project with Name,Deadline and Budget");
            System.out.println("4. Exit");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    Project P1=new Project();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the name of the project:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Deadline of the project:");
                    String Deadline=sc.nextLine();
                    Project P2=new Project(name,Deadline);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the name of the project:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Deadline of the project:");
                    String Deadline=sc.nextLine();
//                    sc.nextLine();
                    System.out.println("Enter the budget of the project:");
                    long Budget=sc.nextLong();
                    Project P3=new Project(name,Deadline,Budget);
                    break;

                }
                case 4:
                {
                    System.out.println("Exiting.....");
                    choice=4;
                    break;
                }
                default:
                {
                    System.out.println("Invalid Output");

                }
            }
        }while(choice!=4);

    }
}
