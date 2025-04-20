package Q3;
public class RamzanHyperPod extends Transport {

    public RamzanHyperPod(int transportID, double velocity, int loadCapacity, double fuelEfficiency) {
        super(transportID, velocity, loadCapacity, fuelEfficiency);
    }

    @Override
    void calculateOptimizedRoute() {
        System.out.println("Navigating underground tunnels...");
    }

    @Override
    void estimateDeliveryTime(double velocity, double distance) {
        double time = distance / velocity;
        System.out.println("Estimated Delivery Time for Ramzan Underground HyperPod: " + time + " s");
    }
}