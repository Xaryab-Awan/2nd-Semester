package Q9;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int[] orignal=new int[5];
        int[] discounted=new int[5];
        Scanner sc=new Scanner(System.in);


        for(int i=0;i<orignal.length;i++){
            System.out.println("Enter price of item  no. "+ (i+1));
            orignal[i]=sc.nextInt();
            discounted[i]=(orignal[i]-(orignal[i]/10));
        }
        System.out.println(" original prices");
        for(int i=0;i<orignal.length;i++) {
            System.out.print(" "+orignal[i]);
        }

        System.out.println(" \nAdjusted prices");
        for(int i=0;i<orignal.length;i++) {
            System.out.print(" "+discounted[i]);
        }
    }
}
