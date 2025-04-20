package Q9;

public class Main
{
    public static void main(String[] args) {
        Subscription s1=new Subscription("3055","Xaryab","basic");
        Subscription s2=new Subscription("2551","Arham","pro");
        Subscription s3=new Subscription("3007","Rafay","enterprise");
        Subscription s4=new Subscription("3008","Saad","pro");
        s1.Display_details("basic");
        s2.Display_details("pro");
        s3.Display_details("enterprise");
        s4.Display_details("pro");
        System.out.println("Total subscriptions: "+Subscription.total_count);
        Subscription.cancel_subscription();
        System.out.println("Total subscriptions: "+Subscription.total_count);
    }
}
