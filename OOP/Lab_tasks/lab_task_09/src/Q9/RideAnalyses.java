package Q9;

import java.util.ArrayList;

public class RideAnalyses {
    public void Analyses(ArrayList<UberRide> UberRides)
    {
        for(UberRide u : UberRides){
            u.PrintReceipt();
        }
    }
}
