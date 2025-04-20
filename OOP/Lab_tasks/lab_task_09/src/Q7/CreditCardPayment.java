package Q7;

public class CreditCardPayment implements Payment{
    double balance;

    public CreditCardPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount){
        if(amount<balance){
            this.balance-=amount;
            System.out.println("Amount Paid Using Credit Card");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }


    public double getPaymentDetails() {
        return this.balance;
    }
    static void PaymentPolicy(){
        System.out.println("Credit Card Payment can only be accepted on site");
    }
}
