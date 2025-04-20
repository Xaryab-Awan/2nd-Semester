package Q3;

public class RamzanTimeShip extends Vehicle {

    public RamzanTimeShip(int vehicleID, double speed, int capacity, double energyEfficiency) {
        super(vehicleID, speed, capacity, energyEfficiency);
    }

    @Override
    void calculateOptimisedRoute(){
        System.out.println("Verifying historical consitency..........");
    }

    @Override
    void calculateDeliveryTime(double speed,double distance){
        distance = distance * 1.82; // nauticle miles aerial distance
        double time = distance/speed;
        System.out.println("Time for Delivery of Ramazan Time Ship is :  "+time+" s");
    }

    @Override
    void command(String action,int packageID,String urgencyLevel){
        if(urgencyLevel.equalsIgnoreCase("urgent")){
            System.out.println("Validating historical accuracy before delivery...");
        }
    }
}
