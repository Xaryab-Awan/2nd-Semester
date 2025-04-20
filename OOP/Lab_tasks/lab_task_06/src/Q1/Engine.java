package Q1;

public class Engine {
    private String horse_power;
    private String fuel_type;
    private String capacity;

    public Engine(String horse_power, String fuel_type, String capacity) {
        this.horse_power = horse_power;
        this.fuel_type = fuel_type;
        this.capacity = capacity;
    }
    public void display() {
        System.out.println("Horse power: " + horse_power);
        System.out.println("Fuel type: " + fuel_type);
        System.out.println("Capacity: " + capacity);
    }


}
