import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double sum=0;
        int pass=0;
        int fail=0;
        int k=0;
        System.out.println("How many students u wish to process grade:");
        int[] grades=new int[a.nextInt()];
        for(int i=0;i< grades.length;i++)
        {
            System.out.printf("Enter grade of %d student:",++k);
            grades[i]=a.nextInt();
            sum=sum+grades[i];
            if(grades[i]>50)
            {
                pass++;
            }
            else{
                fail++;
            }
        }

        System.out.println("Output:");
        System.out.println("*****Results*****");
        System.out.println("Total number of students:"+grades.length);
        System.out.println("Average Grade:"+(sum/ grades.length));
        System.out.println("Number of students passed:"+pass);
        System.out.println("Number of students failed:"+fail);


    }
}
