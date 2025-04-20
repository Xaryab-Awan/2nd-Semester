package Q9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UberRide u1=new UberX("3055",200,100);
        UberRide u2=new UberBlack("2551",300,300);
        UberRide u3=new UberXL("3007",100,200);
        u1.CalculateFare();
        u2.CalculateFare();
        u3.CalculateFare();
        ArrayList<UberRide> uberRides=new ArrayList<>();
        uberRides.add(u1);
        uberRides.add(u2);
        uberRides.add(u3);
        RideAnalyses ra=new RideAnalyses();
        ra.Analyses(uberRides);
    }
}
