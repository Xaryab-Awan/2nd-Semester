package Q6;

public class Car {
    private String Model;
    private String BrandName;
    private String ChassisNumber;
    private Engine e;

    public String getModel() {
        return Model;
    }

    public String getBrandName() {
        return BrandName;
    }

    public String getChassisNumber() {
        return ChassisNumber;
    }

    Car(String Model, String BrandName, String chassisNumber, Engine e){
        this.BrandName=BrandName;
        this.ChassisNumber=chassisNumber;
        this.Model=Model;
        if(e.isAssighned==false){
            e.AssignEngine();
            this.e=e;
        }
        else{
            System.out.println("Engine is already installed in a car");
        }
    }
    void StartCar(){
        System.out.print("Car is now moveable as");
        e.StartEngine();
    }
    void offCar(){
        System.out.print("Car is stopped as");
        e.OffEngine();
    }
}
