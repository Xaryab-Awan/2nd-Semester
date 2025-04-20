package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Grades u want to enter:");
        int N=sc.nextInt();
        int[] Grades=new int[N];
        int temp=0;
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter the Grade "+(i+1)+":");
            temp=sc.nextInt();
            if(temp>100 || temp<0){
                System.out.println("Invalid Grade re enter");
                i=i-1;
                continue;
            }
            Grades[i]=temp;
        }
        int max=Grades[0];
        int min=Grades[0];
        for(int i=0;i<N;i++)
        {
            if(max<Grades[i])
            {
                max=Grades[i];
            }
        }
        for(int i=0;i<N;i++){
            if(min>Grades[i]){
                min=Grades[i];
            }
        }
        int avg=0;
        for(int i=0;i<N;i++){
            avg+=Grades[i];
        }
        avg/=N;
        int above_avg=0;
        for(int i=0;i<N;i++){
            if(Grades[i]>avg){
                above_avg++;
            }
        }
        System.out.println("Maximum Grade: "+max);
        System.out.println("Minimum Grade: "+min);
        System.out.println("Average Grade: "+avg);
        System.out.println("Number of above average Grade Students: "+above_avg);

    }
}
