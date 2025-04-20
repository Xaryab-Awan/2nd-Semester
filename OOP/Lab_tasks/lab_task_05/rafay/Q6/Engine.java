package Q6;

public class Engine {
    private int HorsePower;
    private String FuelType;
    private int capacity;
    boolean isAssighned=false;
    Engine(int a,String b,int c){
        this.HorsePower=a;
        this.FuelType=b;
        this.capacity=c;
    }
    void AssignEngine(){
        isAssighned=true;
    }
    void StartEngine(){
        if(isAssighned==true)
        System.out.println("Engine has been started");
        else {
            System.out.println("engine has to be insatlled in a car");
        }
    }
     void OffEngine(){
        if(isAssighned==true)
        System.out.println("Engine has been off");
        else{
            System.out.println("Engine has to be installed in a car");
        }
    }
    void Display(){
        System.out.println("Engine HorsePower: " + HorsePower);
        System.out.println("Engine FuelType: " + FuelType);
        System.out.println("Engine Capacity: " + capacity);
    }
}
