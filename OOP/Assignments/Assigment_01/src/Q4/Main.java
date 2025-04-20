package Q4;

public class Main {
    public static void main(String[] args) {
        System.out.println("24k-3055");
        System.out.println("Xaryab");
        System.out.println("Bse-2A");
        Student s1=new Student("xaryab","3055");
        Student s2=new Student("arham","2551");
        s1.register();
        s2.register();
        s1.payFee(5000);
        s2.payFee(4000);
        s1.CardStatus();
        s2.CardStatus();
        Transportation route1=new Transportation(111,"Route 01");
        route1.addStop("Stop_1");
        route1.addStop("Stop_2");
        Bus b1=new Bus("Bus112",112);
        b1.setAssignedRoute(route1);
        s1.tapCard(b1);
        s2.tapCard(b1);

    }
}
