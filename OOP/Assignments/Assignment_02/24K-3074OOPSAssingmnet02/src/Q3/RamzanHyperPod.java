package Q3;

public class RamzanHyperPod extends Vehicle{
    public RamzanHyperPod(int vehicleID, double speed, int capacity, double energyEfficiency) {
        super(vehicleID, speed, capacity, energyEfficiency);
    }

    @Override
    void calculateOptimisedRoute(){
        System.out.println("Navigating Underground Tunnels........");
    }

    @Override
    void calculateDeliveryTime(double speed,double distance){
        double time = distance/speed;
        System.out.println("Time for Delivery of Ramazan Underground HyperPod is :  "+time+" s");
    }
}
