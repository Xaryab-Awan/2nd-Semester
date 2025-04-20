package Q3;

public class RamzanDrone extends Vehicle {

    public RamzanDrone(int vehicleID, double speed, int capacity, double energyEfficiency) {
        super(vehicleID, speed, capacity, energyEfficiency);
    }

    @Override
    void calculateOptimisedRoute(){
        System.out.println("Calculating arieal route for high speed delivery......");
    }

    @Override
    void calculateDeliveryTime(double speed,double distance){
        distance = distance * 1.82; // nauticle miles aerial distance
        double time = distance/speed;
        System.out.println("Time for Delivery of Ramazan Drone is :  "+time+" s");
    }

    @Override
    void command(String action,int packageID,String urgencyLevel){
        if(urgencyLevel.equalsIgnoreCase("urgent")){
            System.out.println("Activating High Speed Delivery mode...");
        }
    }
}
