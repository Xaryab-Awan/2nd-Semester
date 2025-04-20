import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter Username:");
        String username=a.nextLine();
        System.out.println("Enter Password");
        String password=a.nextLine();
        double current_balance=200;
        char cho;
        if(password.equals("1234")&& username.equals("xaryab"))
        {
            do {
                System.out.println("Login Successfull ! Welcome "+username);
                System.out.println("******************************");
                System.out.println("Welcome to Bank Of Pakistan:");
                System.out.println("Enter Choice:");
                System.out.println("1. Deposit Money:");
                System.out.println("2. Withdraw Money:");
                System.out.println("3. Account Status:");
                System.out.println("4. Exit");
                int choice=a.nextInt();
                switch (choice)
                {
                    case 1:
                    {
                        System.out.println("Enter the amount of money u want to deposit:");
                        current_balance+=a.nextInt();
                        System.out.println("Money added succesfully, New balance:"+current_balance);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter the amount of money u want to withdraw:");
                        double temp=a.nextInt();
                        if(temp>current_balance)
                        {
                            System.out.println("invalid amount");

                        }
                        else {
                            current_balance=current_balance-temp;
                            System.out.println("Money withdrawed succesfully, New balance:"+current_balance);
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Account Status:");
                        System.out.println("Useraname:"+username);
                        System.out.println("Balance:"+current_balance);
                        break;
                    }
                }
                System.out.println("Do u want to continue?(y/n)");
                cho=a.next().charAt(0);
                a.nextLine();


            }while(cho=='Y' || cho=='y');
        }

    }
}
