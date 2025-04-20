package Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Software Name: ");
        name = sc.nextLine();
        System.out.println("Enter Software License key: ");
        String license_key = sc.nextLine();
        System.out.println("Enter Software Version: ");
        String version = sc.nextLine();
        Software s1 = new Software(name, license_key, version);
        System.out.println("Enter Licensed Software name: ");
        name = sc.nextLine();
        System.out.println("Enter Licensed Software License key: ");
        license_key = sc.nextLine();
        System.out.println("Enter Licensed Software Version: ");
        version = sc.nextLine();
        System.out.println("Enter Licensed Software Expiry date (DD/MM/YYYY): ");
        int expiry_date = sc.nextInt();
        sc.nextLine();
        Licensed_Software l1=new Licensed_Software(name,version,license_key,expiry_date);
        System.out.println("Enter Cloud Software name: ");
        name = sc.nextLine();
        System.out.println("Enter Cloud Software License key: ");
        license_key = sc.nextLine();
        System.out.println("Enter Cloud Software Version: ");
        version = sc.nextLine();
        System.out.println("Enter Cloud Software Expiry date: ");
        expiry_date = sc.nextInt();
        System.out.println("Enter Cloud Software used storage: ");
        int used_storage = sc.nextInt();
        System.out.println("Enter CurrentDate:");
        int current_date=sc.nextInt();
        Cloud_Software c1=new Cloud_Software(name,license_key,version,expiry_date,used_storage);
        s1.Software_Details();
        l1.Check_expiry_date(current_date);
        l1.Licensed_Software_Details();
        c1.remaining_storage();
        c1.Cloud_Software_Details();



    }
}
