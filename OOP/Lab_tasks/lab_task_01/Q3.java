package Lab_Task_01;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int num1= a.nextInt();
        System.out.println("Enter Num2:");
        int num2= a.nextInt();
        System.out.println("Enter Num3:");
        int num3= a.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("Num 1 is largest");
        }
        if(num2>num1 && num2>num3)
        {
            System.out.println("Num 2 is largest");
        }
        else {
            System.out.println("Num 3 is largest");
        }

    }
}
