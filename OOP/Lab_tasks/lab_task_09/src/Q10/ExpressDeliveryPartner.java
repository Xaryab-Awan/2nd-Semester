package Q10;

public class ExpressDeliveryPartner implements DeliveryPolicy{
    public void assignRider(){
        System.out.println("Assigning Rider");
    }
    public void calculateDeliveryCharge(){
        System.out.println("No Delivery Charges");
    }

}
