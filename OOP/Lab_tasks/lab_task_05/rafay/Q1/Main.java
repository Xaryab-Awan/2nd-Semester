package Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders=new ArrayList<>();
        Catogry electronics = new Catogry("Electronics","Need Electricity to work");
        Catogry accessories = new Catogry("Accessories","parts of products");
        Catogry clothing = new Catogry("Clothing","things to wear");
        Catogry sports = new Catogry("Sports","it contain sportss related items");
        Catogry fitness = new Catogry("Fitness","it contain fitness items");

        ArrayList<Catogry> smartWatchCategories = new ArrayList<>();
        smartWatchCategories.add(electronics);
        smartWatchCategories.add(accessories);
        smartWatchCategories.add(fitness);

        ArrayList<Catogry> runningShoesCategories = new ArrayList<>();
        runningShoesCategories.add(clothing);
        runningShoesCategories.add(sports);
        runningShoesCategories.add(fitness);

        ArrayList<Catogry> wirelessEarbudsCategories = new ArrayList<>();
        wirelessEarbudsCategories.add(electronics);
        wirelessEarbudsCategories.add(accessories);

        ArrayList<Catogry> yogaMatCategories = new ArrayList<>();
        yogaMatCategories.add(fitness);
        yogaMatCategories.add(sports);

        ArrayList<Catogry> hoodieCategories = new ArrayList<>();
        hoodieCategories.add(clothing);
        hoodieCategories.add(sports);

        ArrayList<Catogry> fitnessTrackerCategories = new ArrayList<>();
        fitnessTrackerCategories.add(electronics);
        fitnessTrackerCategories.add(fitness);

        Product smartWatch = new Product("Smart Watch", 201, 150, 30, smartWatchCategories);
        Product runningShoes = new Product("Running Shoes", 202, 80, 50, runningShoesCategories);
        Product wirelessEarbuds = new Product("Wireless Earbuds", 203, 120, 25, wirelessEarbudsCategories);
        Product yogaMat = new Product("Yoga Mat", 204, 40, 60, yogaMatCategories);
        Product hoodie = new Product("Hoodie", 205, 35, 100, hoodieCategories);
        Product fitnessTracker = new Product("Fitness Tracker", 206, 90, 20, fitnessTrackerCategories);

        Order o1=new Order(1,"abdulrafay 24k-3007");
        o1.addProduct(smartWatch);
        o1.addProduct(yogaMat);
        o1.addProduct(hoodie);
        Order o2=new Order(2,"xaryab 24k-3055");
        o2.addProduct(smartWatch);
        o2.addProduct(hoodie);
        Order o3=new Order(2,"bisma 24k-3012");
        o3.addProduct(smartWatch);
        o3.addProduct(runningShoes);
        o3.addProduct(fitnessTracker);
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        for(Order x:orders){
            x.displayDetails();
        }
    }
}
