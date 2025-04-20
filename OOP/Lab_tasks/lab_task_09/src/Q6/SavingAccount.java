package Q6;

public class SavingAccount implements BankAccount{
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Amount Deposited");
    }
    public void withdraw(double amount){
        if(amount<balance){
            this.balance-=amount;
            System.out.println("Amount withdrawed");
        }
        else {
            System.out.println("Insufficient Amount");
        }
    }

}
