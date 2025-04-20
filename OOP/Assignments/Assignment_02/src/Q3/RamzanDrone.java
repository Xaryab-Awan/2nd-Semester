package Q3;

public class RamzanDrone extends Transport {

    public RamzanDrone(int transportID, double velocity, int loadCapacity, double fuelEfficiency) {
        super(transportID, velocity, loadCapacity, fuelEfficiency);
    }

    @Override
    void calculateOptimizedRoute() {
        System.out.println("Calculating aerial route for high-speed delivery...");
    }

    @Override
    void estimateDeliveryTime(double velocity, double distance) {
        distance = distance * 1.82; // Nautical miles aerial distance
        double time = distance / velocity;
        System.out.println("Estimated Delivery Time for Ramzan Drone: " + time + " s");
    }

    @Override
    void executeCommand(String action, int packageID, String priorityLevel) {
        if (priorityLevel.equalsIgnoreCase("urgent")) {
            System.out.println("Activating high-speed delivery mode...");
        }
    }
}