package Q12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("1. Book name author and price");
            System.out.println("2. only Book Title and Author");
            System.out.println("3. Only Book Title");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter Author");
                    String Author=sc.nextLine();
                    System.out.println("Enter Price:");
                    int price=sc.nextInt();
                   Book B1=new Book(name,Author,price);
                   B1.DisplayDetails();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter Author");
                    String Author=sc.nextLine();
                    Book B2=new Book(name,Author);
                    B2.DisplayDetails();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    Book B2=new Book(name);
                    B2.DisplayDetails();
                    break;
                }
                default:{

                }
            }
        }while(choice!=4);

    }
}
