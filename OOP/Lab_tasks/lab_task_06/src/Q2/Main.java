package Q2;

public class Main {
    public static void main(String[] args) {
        MedicalRecord m1=new MedicalRecord("none","properSleep","none","positive");
        MedicalRecord m2=new MedicalRecord("none","decrease junkFood","none","partial negative");
        Patient p1=new Patient("Xaryab",18,"male",m1);
        Patient p2=new Patient("Arham",18,"male",m2);
        p1.Display_details();
        p2.Display_details();
    }
}
