import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees u want to check?");
        num=sc.nextInt();
        double[] arr=new double[num];
        double[] sales=new double[num];
        float[] percentage=new float[num];
        String[] performace=new String[num];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the monthly sales of "+ (i+1)+" Employee");
           sales[i]=sc.nextDouble();
            System.out.println("Enter the attendance percentage of "+ (i+1)+" Employee");
            percentage[i]= sc.nextFloat();
           if(sales[i]>=10000)
           {
               if(percentage[i]>90)
               {
                   System.out.println("Result : Outstanding!!!");
                   performace[i]="Outstanding!!!";
               }
               if(percentage[i]>75 && percentage[i]<90)
               {
                   System.out.println("Result: Satisfactory!");
                   performace[i]="Satisfactory!";
               }
               if(percentage[i]<75)
               {
                   System.out.println("Result: Needs Improvement!");
                   performace[i]="Needs Improvement!";
               }
           } else if (sales[i]>=5000 && sales[i]<10000) {
               if(percentage[i]>80)
               {
                   System.out.println("Satisfactory!");
                   performace[i]="Satisfactory!";
               }
               if(percentage[i]<=80)
               {
                   System.out.println("Needs Improvement!");
                   performace[i]="Needs Improvement!";
               }
           } else if (sales[i]<5000) {
               System.out.println("Needs Improvement!");
               performace[i]="Needs Improvement!";
               
           }

        }
        System.out.println("Final Report:");
        System.out.println("+-------------------------+-------------------------+-------------------------+");
        System.out.println("|  Employee Number         |    Monthly Sales            |            Performance            |");
        for(int i=0;i<num;i++)
        {
            System.out.println("| "+(i+1)+"                        |   "+(sales[i])+"                   |        "+(performace[i])+"          |");
        }
        System.out.println("+-------------------------+-------------------------+-------------------------+");

    }
}
