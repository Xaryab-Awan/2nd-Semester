package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Login<String> login = new Login<>("xaryab", "0741");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        login.authenticate(user, pass);

        scanner.close();
    }
}