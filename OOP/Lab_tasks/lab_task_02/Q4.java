import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        double even=0;
        double odd=0;
        int num=0;
        Scanner a= new Scanner(System.in);
        System.out.println("Enter Integrs between 1-100 (-1 to stop):");
        do {
            num=a.nextInt();
            if(num%2==0)
            {
                even=even+num;
            }
            else {
                if(num!=-1) {
                    odd = odd + num;
                }
            }
        }while(num !=-1);
        System.out.println("Sum of Even Numbers is:"+even);
        System.out.println("Sum of Odd Numbers is:"+odd);
    }
}
