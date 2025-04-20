import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        char choice;
        do
        {
            double total=0;
            int[] marks=new int[5];
            Scanner a=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter Subject "+(i+1)+" marks:");
                marks[i]=a.nextInt();
                total=total+marks[i];
            }
            float percentage= (float) (total*(0.2));
            System.out.println("Total marks : 500");
            System.out.println("Obtained Marks :" + total);
            System.out.println("Percentage:"+percentage);
            if(percentage>90 && percentage<100)
            {
                System.out.println("A+");
            }
            else if(percentage>80 && percentage<90)
            {
                System.out.println("A");
            }
            else if(percentage>70 && percentage<80)
            {
                System.out.println("B+");
            }
            else if(percentage>60 && percentage<70)
            {
                System.out.println("B");
            }
            else if(percentage>=45 && percentage<60)
            {
                System.out.println("C+");
            }
            else
            {
                System.out.println("F");
            }
            System.out.println("Do u want to continue?");
            choice=a.next().charAt(0);
        }while(choice =='Y' || choice =='y');
    }
}
