package Q9;

public class UberX extends UberRide{
    public UberX(String rideId, int distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

   public double CalculateFare(){
        return (this.baseFare*this.distance+100);
    }


    public void DispatchDriver() {
        System.out.println("UberX Driver Dispatched!");
    }
}
