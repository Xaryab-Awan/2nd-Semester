package Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Device> Obj =new ArrayList<Device>();
    int choice=0;
    do {
        System.out.println("1. Add device with default values:");
        System.out.println("2. Add device with custom values:");
        System.out.println("3. Calculate Total PowerConsumption:");
        System.out.println("4. Remove a Device:");
        System.out.println("5. Display All Devices:");
        System.out.println("6. Exit");
        choice=sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                Device D=new Device();
                D.DisplayDetails();
                Obj.add(D);
                break;
            }
            case 2:{
                System.out.println("Enter the Device ID");
                long id=sc.nextLong();
                System.out.println("Enter the Device Type:");
                String type=sc.nextLine();
                sc.nextLine();
                System.out.println("Enter PowerConsumption:");
                int consumption=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the device Status(on/off): ");
                char temp = sc.next().charAt(1);
                boolean status=false;
                if(temp=='n'){
                    status=true;
                }
                else if(temp=='f'){
                    status=false;
                }
                Device D=new Device(id,type,consumption,status);
                Obj.add(D);
                break;
            }
            case 3:
            {
                int power=0;
                for (Device device : Obj) {
                    if (device.Status) {
                        power = power + device.PowerConsumption;
                    }
                }
                System.out.println("Total Power Consumption: "+power);
                break;
            }
            case 4:
            {
                System.out.println("Which Device U want to remove(Enter Id):");
                long id=sc.nextLong();
                Boolean removed=false;
                Iterator<Device> iterator=Obj.iterator();
                while(iterator.hasNext())
                {
                    Device D=iterator.next();
                    if(D.DeviceID==id){
                        iterator.remove();
                        System.out.println("Device with ID " + id + " removed successfully.");
                        removed = true;
                        break;
                    }
                    if (!removed) {
                        System.out.println("Device with ID " + id + " not found.");
                    }
                    break;
                }

            }
            case 5:{
                for (Device device : Obj) {
                    device.DisplayDetails();
                }
                break;
            }
            case 6:
            {
                System.out.println("Exiting....");
                break;
            }
        }
    }while(choice!=6);

    }
}
