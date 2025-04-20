package Q6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Engine engine1 = new Engine(200, "Petrol", 1500);
        Engine engine2 = new Engine(300, "Diesel", 2000);
        Engine engine3 = new Engine(150, "Electric", 1000);

        Car car1 = new Car("Model S", "Tesla", "12345", engine1);
        Car car2 = new Car("Model X", "Tesla", "67890", engine2);
        Car car3 = new Car("Model 3", "Tesla", "54321", engine3);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Car car4 = new Car("Model Y", "Tesla", "98765", engine1);


        System.out.println("Details of all cars:");
        for (Car car : cars) {
            System.out.println("Car Model: " + car.getModel());
            System.out.println("Car Brand: " + car.getBrandName());
            System.out.println("Car Chassis Number: " + car.getChassisNumber());
            System.out.println("---");
        }

    }
}