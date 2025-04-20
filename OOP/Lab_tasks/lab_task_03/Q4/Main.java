package Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Course C1 = new Course();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of the course : ");
        String code = sc.nextLine();
        System.out.println("Enter the Course Name");
        String name = sc.nextLine();
        System.out.println("Enter the course credit hours");
        int credit = sc.nextInt();

        C1.setValues(code, name, credit);
        C1.getValues();

    }
}
