package Q8;

public class EconomyRide implements RideService{
    private String RideType;
    private String paymentMode;
    private double fare;

    public EconomyRide(String rideType, String paymentMode) {
        RideType = rideType;
        this.paymentMode = paymentMode;

    }

    @Override
    public void calculateFare(double distance){
        this.fare=(distance*Base_Fare)+100;

    }
    public String getRideType(){
        return this.RideType;
    }

    public void PaymentMode(){
        System.out.println("PaymentMode: "+this.paymentMode);
    }
    public void DisplayDetails(){
        System.out.println("RideType: "+this.RideType);
        System.out.println("PaymentMode: "+this.paymentMode);
        System.out.println("Fare: "+this.fare);
    }
}
