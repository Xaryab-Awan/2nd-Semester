package Q7;

public class PayPalPayment implements Payment{
    double balance;

    public PayPalPayment(double balance) {
        this.balance = balance;
    }


    public void pay(double amount) {
        if(amount<balance){
            this.balance-=amount;
            System.out.println("Amount Paid Using PayPal");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getPaymentDetails() {
        return this.balance;
    }
    static void PaymentPolicy(){
        System.out.println("PayPal Payment can be done online");
    }
}
