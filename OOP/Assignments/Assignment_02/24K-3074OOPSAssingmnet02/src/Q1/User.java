package Q4;

public abstract class User {
    protected int id;
    protected String name;
    protected String cardNumber;
    protected double balance;

    public User(int id, String name, String cardNumber, double balance) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public abstract void payFees();

    public boolean tapCard() {
        if (balance >= 500) {
            balance -= 500;
            System.out.println(name + " tapped card. Entry granted.");
            return true;
        } else {
            System.out.println(name + " has insufficient balance!");
            return false;
        }
    }

    public void processPayment(double amount) {
        balance += amount;
        System.out.println(name + " paid " + amount + ". New balance: " + balance);
    }
}
