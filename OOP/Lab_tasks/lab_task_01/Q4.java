package Lab_Task_01;
import java.util.Scanner;
public class Q4 {
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=obj.nextInt();
        int temp;
        int sum=0;
        while(num!=0)
        {
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println("The sum of digits is "+sum);

    }
}
