package Q7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment p1=new CreditCardPayment(3000);
        Payment p2=new PayPalPayment(4000);
        Payment p3=new BitcointPayment(4000);
        ArrayList<Payment> arrayList=new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        for(Payment payment:arrayList){
            payment.pay(300);
            System.out.println(payment.getPaymentDetails());
        }
        CreditCardPayment.PaymentPolicy();
        PayPalPayment.PaymentPolicy();
        BitcointPayment.PaymentPolicy();
    }
}
