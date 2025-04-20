package Q10;

public class RestrauntPartner implements DeliveryPolicy, OrderPolicy {

    private Boolean busyhours;
    private double baseprice;
    private double preparationtime;

    public RestrauntPartner(Boolean busyhours, double baseprice) {
        this.busyhours = busyhours;
        this.baseprice = baseprice;

    }

    public void assignRider() {
        System.out.println("Assigning rider to RestrauntPartner");
    }
    public void calculateDeliveryCharge() {
        if(busyhours) {
            System.out.println("Delivery Charges: Rs 100");
        }
        else{
            System.out.println("Delivery Charges: Rs 50");
        }

    }
    public void acceptOrder() {
        System.out.println("Accepting Order");
    }
    public void calculatePreparationTime(boolean busyhours) {
        if(busyhours){
            this.preparationtime = baseprice *2;
        }
        else {
            this.preparationtime = baseprice;
        }

    }



}
