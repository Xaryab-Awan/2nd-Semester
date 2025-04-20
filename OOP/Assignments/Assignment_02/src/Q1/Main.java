package Q1;
public class Main {
    public static void main(String[] args) {
        User student1 = new Student(101, "Syed Arham", "CARD123", 600, 5000);
        User teacher1 = new Teacher(201, "Xaryab", "CARD456", 1000, 10000);
        User staff1 = new StaffMember(301, "Saad", "CARD789", 700, "Admin");
        Route route1 = new Route(1);
        route1.addStop("Stop A");
        route1.addStop("Stop B");
        Bus bus1 = new Bus("BUS-01", 50);
        bus1.assignRoute(route1);
        student1.payFees();
        teacher1.payFees();
        staff1.payFees();
        bus1.checkUserTap(student1);
        bus1.checkUserTap(teacher1);
        bus1.checkUserTap(staff1);
        Route route2 = new Route(1);
        route2.addStop("Stop A");
        route2.addStop("Stop B");
        System.out.println("Are route1 & route2 the same? " + route1.equals(route2));
        System.out.println("Are student1 & teacher1 the same? " + student1.equals(teacher1));
    }
}
