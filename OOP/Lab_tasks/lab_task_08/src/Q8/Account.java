package Q8;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public void debit(double money){
        if(money > this.balance){
            System.out.println("Insufficient Funds");
        }
        else{
            this.balance -= money;
            System.out.println("Debit Successful");
        }
    }
    public void credit(double money){
        if(money > this.balance){
            System.out.println("Insufficient Funds");
        }
        else{
            this.balance += money;
            System.out.println("Credit Successful");
        }
    }

    public double getBalance() {
        return balance;
    }
}
