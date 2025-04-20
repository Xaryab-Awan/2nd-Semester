package Lab_Task_01;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius:");
        float temp=obj.nextInt();
        double F= (temp*9/5)+32;
        System.out.println("The temperature in Fahrenhiet is "+F );
    }
}
