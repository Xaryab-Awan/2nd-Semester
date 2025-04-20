import java.util.*;
public class Q8 {
    public static void main(String[] args) {

        char choice;
        do
        {
            int total=0;
            int [] price=new int[5];
            String[] items=new String[5];
            Scanner a=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter item:");
                items[i]=a.nextLine();
                System.out.println("Enter Price:");
                price[i]=a.nextInt();
                a.nextLine();
                total=total+price[i];
            }
            double discount=total*0.01;
            System.out.println("**********************");
            System.out.println("        Slip       ");
            System.out.println("**********************");
            for(int i=0;i<5;i++)
            {
                System.out.println(items[i]+ "  " + price[i]);
            }
            System.out.println("----------------------");
            System.out.println("SubTotal :" + total);
            System.out.println("Discount Percent: 10%");
            System.out.println("Discount Amount: "+ discount);
            System.out.println("----------------------");
            System.out.println("----------------------");
            System.out.println("Total after Discount: " +(total-discount));
            System.out.println("********************");
            System.out.println("Do u want to continue?");
            choice=a.next().charAt(0);
        }while(choice =='Y' || choice =='y');







    }
    }

