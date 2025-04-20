package Lab_Task_01;

import java.util.Scanner;

public class Q1 {;
        public static void main(String[] args)
        {
            Scanner a = new Scanner(System.in);
            System.out.println("Enter First Number:");
            int num1= a.nextInt();
            System.out.println("Enter Second Number:");
            int num2= a.nextInt();
            System.out.println("Enter Three Number:");
            int num3= a.nextInt();
            int sum=num1+num2+num3;
            System.out.printf("The sum is %d",sum);
            System.out.printf("\n");
            System.out.println("The sum is " + sum );
            int avg=(num1+num2+num3)/3;
            System.out.printf("The avg of three digits are %d",avg);


        }
    }


