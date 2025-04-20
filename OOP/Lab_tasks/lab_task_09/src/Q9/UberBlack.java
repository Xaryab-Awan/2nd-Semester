package Q9;

public class UberBlack extends UberRide{
    public UberBlack(String rideId, int distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    public double CalculateFare(){
        return (this.baseFare*this.distance+200);
    }


    public void DispatchDriver() {
        System.out.println("UBER BLACK Driver Dispatched!");
    }
}

