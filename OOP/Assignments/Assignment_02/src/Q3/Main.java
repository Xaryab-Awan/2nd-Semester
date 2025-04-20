package Q3;

public class Main {
    public static void main(String[] args) {
        RamzanDrone drone = new RamzanDrone(101, 120.5, 5, 0.8);
        RamzanHyperPod hyperPod = new RamzanHyperPod(201, 300.0, 50, 0.6);
        RamzanTimeShip timeShip = new RamzanTimeShip(301, 150.0, 20, 0.7);

        System.out.println("\n--- Route Calculations ---");
        drone.calculateOptimizedRoute();
        hyperPod.calculateOptimizedRoute();
        timeShip.calculateOptimizedRoute();

        System.out.println("\n--- Delivery Time Estimates ---");
        drone.estimateDeliveryTime(120.5, 15.0);
        hyperPod.estimateDeliveryTime(300.0, 30.0);
        timeShip.estimateDeliveryTime(150.0, 25.0);

        System.out.println("\nCommand Execution ");
        drone.executeCommand("Deliver", 1);
        hyperPod.executeCommand("Deliver", 2, "Normal");
        timeShip.executeCommand("Deliver", 3, "Urgent");

        System.out.println("\nDelivery Tracking ");
        System.out.print("Initial ");
        drone.getActiveDeliveriesCount();

        System.out.println("\nEfficiency Comparison ");
        Transport efficientTransport = Transport.compareFuelEfficiency(drone, hyperPod);
        System.out.println("More efficient transport ID: " + efficientTransport.transportID);
    }
}