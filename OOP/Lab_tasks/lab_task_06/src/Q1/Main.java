package Q1;

public class Main {
    public static void main(String[] args) {
        Engine e1=new Engine("1500","petrol","2000L");
        Engine e2=new Engine("2000","petrol","2000L");
        Car c1=new Car("Ferrari","1999","3055",e1);
        Car c2=new Car("Boggati","2002","2551",e2);
        c1.Display_details();
        c2.Display_details();
//        c1.finalize();
//        c2.finalize();
    }
}
