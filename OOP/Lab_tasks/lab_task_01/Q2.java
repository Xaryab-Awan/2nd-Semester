package Lab_Task_01;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=obj.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
