package Q3;

public class Transport {
    protected int transportID;
    protected double velocity;
    protected int loadCapacity;
    protected double fuelEfficiency;
    protected static int activeDeliveriesCount;

    Transport(int transportID, double velocity, int loadCapacity, double fuelEfficiency) {
        this.transportID = transportID;
        this.velocity = velocity;
        this.loadCapacity = loadCapacity;
        this.fuelEfficiency = fuelEfficiency;
        activeDeliveriesCount++;
    }

    void calculateOptimizedRoute() {
        System.out.println("Calculating default route...");
    }

    void executeCommand(String action, int packageID) {
        System.out.println(action + " for packageID: " + packageID);
    }

    void executeCommand(String action, int packageID, String priorityLevel) {
        System.out.println("Priority Level: " + priorityLevel + " for packageID: " + packageID);
    }

    void estimateDeliveryTime(double velocity, double distance) {
        double time = distance / velocity;
        System.out.println("Estimated Time: " + time + " s");
    }

    void getActiveDeliveriesCount() {
        System.out.println("Active Deliveries Count: " + activeDeliveriesCount);
    }

    static Transport compareFuelEfficiency(Transport t1, Transport t2) {
        if (t1.fuelEfficiency > t2.fuelEfficiency) {
            System.out.println("Transport ID: " + t1.transportID + " is more suited for this task");
            return t1;
        } else {
            System.out.println("Transport ID: " + t2.transportID + " is suited for this task");
            return t2;
        }
    }

    void setTransportID(int transportID) {
        this.transportID = transportID;
    }

    void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
