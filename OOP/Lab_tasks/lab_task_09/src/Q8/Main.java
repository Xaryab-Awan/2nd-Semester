package Q8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RideService e1=new EconomyRide("Economy","Cash");
        RideService b1=new BusinessRide("business","Card");
        RideService b2=new BikeRide("Bike","Cash");
        e1.calculateFare(300);
        b1.calculateFare(200);
        b2.calculateFare(100);
        System.out.println(e1.getRideType());
        System.out.println(b1.getRideType());
        System.out.println(b2.getRideType());
        e1.PaymentMode();
        b1.PaymentMode();
        b2.PaymentMode();
        ArrayList<RideService> R1=new ArrayList<>();
        R1.add(e1);
        R1.add(b1);
        R1.add(b2);
        for(RideService r:R1){
            r.DisplayDetails();
        }

    }
}
