package Lab_Task_01;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.printf("Enter  number:");
        int num=obj.nextInt();
        int fact=1;
        for(int i=num;i>0;i--)
        {

            fact=fact*i;

        }
        System.out.println("The factorial is "+ fact);
    }
}
