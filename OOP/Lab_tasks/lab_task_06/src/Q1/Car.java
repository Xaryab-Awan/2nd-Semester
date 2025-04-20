package Q1;

public class Car  {
    private String brand_name;
    private String model;
    private String Chassis_no;
    private Engine engine;

    public Car(String brand_name, String model, String chassis_no,Engine e) {
        this.brand_name = brand_name;
        this.model = model;
        Chassis_no = chassis_no;
        this.engine = e;

    }
    public void Display_details(){
        System.out.println("Brand: " + brand_name);
        System.out.println("Model: " + model);
        System.out.println("Chassis: " + Chassis_no);
        System.out.println("Engine: ");
        engine.display();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Car finalized");
//        engine.finalize();
//        System.out.println("Engine finalized");
//
//    }
}
