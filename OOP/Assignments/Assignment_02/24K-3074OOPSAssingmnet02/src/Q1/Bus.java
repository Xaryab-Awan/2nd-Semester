package Q4;

public class Bus {
    private String busNumber;
    private Route route;
    private int capacity;

    public Bus(String busNumber, int capacity) {
        this.busNumber = busNumber;
        this.capacity = capacity;
    }

    public void assignRoute(Route route) {
        this.route = route;
        System.out.println("Route assigned to bus " + busNumber);
    }

    public void checkUserTap(User user) {
        if (user.tapCard()) {
            System.out.println(user.name + " allowed on the bus.");
        } else {
            System.out.println(user.name + " denied entry.");
        }
    }
}
