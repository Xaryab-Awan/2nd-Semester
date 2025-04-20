package Q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new SavingAccount(30000);
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) TotalBalance");
            System.out.println("4) Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter amount to deposit:");
                    double amount=sc.nextDouble();
                    account.deposit(amount);
                    break;
                }
                case 2:{
                    System.out.println("Enter amount to withdraw:");
                    double amount=sc.nextDouble();
                    account.withdraw(amount);
                    break;
                }
                case 3:{
                    System.out.println("TOTAL BALANCE: "+account.getBalance());
                    break;
                }
                case 4:{
                    choice=4;
                    System.out.println("Exiting......");
                    break;
                }

            }

        }while(choice!=4);
            }
}
