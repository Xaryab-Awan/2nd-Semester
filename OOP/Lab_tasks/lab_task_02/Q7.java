import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        String[] books=new String[5];
        char choice;
        Scanner a=new Scanner(System.in);
        do {
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter Book "+(i+1));
                books[i]=a.nextLine();
            }
            System.out.println("Borrowed Books:");
            for(int i=0;i<5;i++)
            {
                System.out.println((i+1)+books[i]);
            }
            System.out.println("Fine per day (overdue): $2.00");
            System.out.println("Continue for another user(y/n)");
            choice=a.next().charAt(0);
            a.nextLine();
        }while(choice=='y'|| choice=='Y');

    }
}
