package Q9;

public abstract class UberRide {
    public String rideId;
    public int distance;
    public double baseFare;

    public UberRide(String rideId, int distance, double baseFare) {
        this.rideId = rideId;
        this.distance = distance;
        this.baseFare = baseFare;
    }
    public abstract double CalculateFare();
    public abstract void DispatchDriver();

    public void PrintReceipt() {
        System.out.println("Ride ID: "+this.rideId);
        System.out.println("Distance: "+this.distance);
        System.out.println("Base Fare: "+this.baseFare);
    }
}
