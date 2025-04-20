package Q7;

public class BitcointPayment implements Payment{
    double balance;

    public BitcointPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if(amount<balance){
            this.balance-=amount;
            System.out.println("Amount Paid Using Bit Coin");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getPaymentDetails() {
        return this.balance;
    }
    static void PaymentPolicy(){
        System.out.println("BitCoin Payment can be done only on Binance");
    }
}

