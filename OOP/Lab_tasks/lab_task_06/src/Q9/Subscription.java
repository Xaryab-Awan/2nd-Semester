package Q9;

public class Subscription {
    private String subscription_id;
    private String customer_name;
    private String plan_type;
    static int total_count;
    final int basic_price=500;
    final int pro_price=1000;
    final int enterprise_price=1500;

    public Subscription(String subscription_id, String customer_name, String plan_type) {
        this.subscription_id = subscription_id;
        this.customer_name = customer_name;
        this.plan_type = plan_type;
        total_count++;
    }

    static void cancel_subscription() {
        total_count--;
    }
    public void Display_details(String plan_type) {
        System.out.println("Subscription ID: " + subscription_id);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Plan Type: " + plan_type);
        if(plan_type.equals("basic")) {
            System.out.println("Price per basic plan: " + basic_price);
        }
        else if(plan_type.equals("pro")) {
            System.out.println("Price per pro plan: " + pro_price);
        }
        else if(plan_type.equals("enterprise")) {
            System.out.println("Price per enterprise: " + enterprise_price);
        }
        else {
            System.out.println("Invalid Plan Type: " + plan_type);
        }

    }
}
