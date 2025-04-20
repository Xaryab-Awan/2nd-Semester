package Q3;

public class Main {
    public static void main(String[] args) {
        RamzanDrone drone = new RamzanDrone(101, 120.5, 5, 0.8);
        RamzanHyperPod hyperPod = new RamzanHyperPod(201, 300.0, 50, 0.6);
        RamzanTimeShip timeShip = new RamzanTimeShip(301, 150.0, 20, 0.7);

        System.out.println("\n--- Route Calculations ---");
        drone.calculateOptimisedRoute();
        hyperPod.calculateOptimisedRoute();
        timeShip.calculateOptimisedRoute();


        System.out.println("\n--- Delivery Time Estimates ---");
        drone.calculateDeliveryTime(120.5, 15.0);
        hyperPod.calculateDeliveryTime(300.0, 30.0);
        timeShip.calculateDeliveryTime(150.0, 25.0);


        System.out.println("\nCommand Execution ");
        drone.command("Deliver", 1);
        hyperPod.command("Deliver", 2, "Normal");
        timeShip.command("Deliver", 3, "Urgent");

        System.out.println("\nDelivery Tracking ");
        System.out.print("Initial ");
        drone.numberOfActiveDeliveries();


        System.out.println("\nEfficiency Comparison ");
        Vehicle efficientVehicle = Vehicle.compareEfficiency(drone, hyperPod);
        System.out.println("More efficient vehicle ID: " + efficientVehicle.vehicleID);
    }
}
