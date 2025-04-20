package Q4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(11, "Saad Naeem", "CARD3074", 600, 3000);
        Teacher teacher1 = new Teacher(22, "Sir Minhal Raza", "CARD436", 1000, 10000);
        StaffMember staff1 = new StaffMember(33, "Kamran Ali", "CARD789", 700, "Admin");

        Route route1 = new Route(1);
        route1.addStop("Quaidabad");
        route1.addStop("korangi");

        Bus bus1 = new Bus("Bus-1", 50);
        bus1.assignRoute(route1);

        student1.payFees();
        teacher1.payFees();
        staff1.payFees();

        bus1.checkUserTap(student1);
        bus1.checkUserTap(teacher1);
        bus1.checkUserTap(staff1);

        Route route2 = new Route(1);
        route2.addStop("Karsaz");
        route2.addStop("Saddar");

        System.out.println("Are route1 and route2 the same? " + route1.equals(route2));
    }
}
