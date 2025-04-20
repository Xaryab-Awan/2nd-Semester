package Q5;

public class Device {
    long DeviceID;
    String DeviceType;
    int PowerConsumption;
    Boolean Status;

    Device() {
        System.out.println("Default Device Created:");
        DeviceID = 0000;
        DeviceType = "Unknown";
        PowerConsumption = 0;
        Status = false;
    }
    Device(long DeviceID,String DeviceType,int PowerConsumption,Boolean Status)
    {
        System.out.println("Device Created:");
        this.DeviceID=DeviceID;
        this.DeviceType=DeviceType;
        this.PowerConsumption=PowerConsumption;
        this.Status=Status;
    }
    void DisplayDetails()
    {
        System.out.println("Device ID: "+DeviceID);
        System.out.println("Device type: "+DeviceType);
        System.out.println("PowerConsumption: "+PowerConsumption);
        System.out.println("Status: "+Status);
    }

}
