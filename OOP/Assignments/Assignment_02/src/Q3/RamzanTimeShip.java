package Q3;

public class RamzanTimeShip extends Transport{
    public RamzanTimeShip(int transportID, double velocity, int loadCapacity, double fuelEfficiency) {
        super(transportID, velocity, loadCapacity, fuelEfficiency);
    }

    @Override
    void calculateOptimizedRoute() {
        System.out.println("Verifying historical data consistency...");
    }

    @Override
    void estimateDeliveryTime(double velocity, double distance) {
        distance = distance * 1.82; // Nautical miles aerial distance
        double time = distance / velocity;
        System.out.println("Estimated Delivery Time for Ramzan Time Ship: " + time + " s");
    }

    @Override
    void executeCommand(String action, int packageID, String priorityLevel) {
        if (priorityLevel.equalsIgnoreCase("urgent")) {
            System.out.println("Validating historical accuracy before delivery...");
        }
    }
}
