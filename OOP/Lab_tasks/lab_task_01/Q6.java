package Lab_Task_01;
import java.util.Scanner;
public class Q6 {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=obj.nextInt();
        System.out.println("Enter Second Number:");
        int num2=obj.nextInt();
        System.out.printf("Before Swapping Num1 : %d \n Num2 : %d\n",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Num1="+num1);
        System.out.println("Num2="+num2);
    }
}
