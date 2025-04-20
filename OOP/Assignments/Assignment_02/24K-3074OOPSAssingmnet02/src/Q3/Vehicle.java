package Q3;

public class Vehicle {

    protected int vehicleID;
    protected double speed;
    protected int capacity;
    protected double energyEfficiency;
    protected static int noOfActiveDeliveries;

    Vehicle(int vehicleID, double speed, int capacity, double energyEfficiency) {
        this.vehicleID = vehicleID;
        this.speed = speed;
        this.capacity = capacity;
        this.energyEfficiency = energyEfficiency;
        noOfActiveDeliveries++;
    }

    void calculateOptimisedRoute(){
        System.out.println("calcuating deafult route");
    }

    void command(String action,int packageID){
        System.out.println("" + action + "for packageID: " + packageID);
    }

    void command(String action,int packageID,String urgencyLevel){
        System.out.println("Urgency Level: " + urgencyLevel + "for packageID: " + packageID);
    }

    void calculateDeliveryTime(double speed,double distance){
        double time = (distance/speed);
        System.out.println("Time: "+" s" + time);
    }

    void numberOfActiveDeliveries(){
        System.out.println("Number of active deliveries: "+noOfActiveDeliveries);
    }

    static Vehicle compareEfficiency(Vehicle v1, Vehicle v2){
        if(v1.energyEfficiency > v2.energyEfficiency){
            System.out.println("Vehicle ID : "+v1.vehicleID+" is more suited for this tasks");
            return v1;
        }
        else{
            System.out.println("Vehicle ID : "+v2.vehicleID+" is suited for this tasks");
            return v2;
        }

    }

    void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setEnergyEfficiency(double energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

}

