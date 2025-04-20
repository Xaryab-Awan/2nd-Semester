package Q9;

public class UberXL extends UberRide{
    public UberXL(String rideId, int distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    public double CalculateFare(){
        return (this.baseFare*this.distance+1000);
    }


    public void DispatchDriver() {
        System.out.println("UBER XL Driver Dispatched!");
    }
}
