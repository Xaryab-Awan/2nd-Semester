package Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles("Mustang", "1999", 3000, "Full");
        Vehicles v2 = new Vehicles("Alto", "2006", 1000, "intermediate");
        Vehicles v3 = new Vehicles("Mehran", "2010", 500, "Learner");
        ArrayList<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        User u1 = new User(18, "Full", "3055", "xaryabawan@gmail.com");
        User u2 = new User(19, "Intermediate", "2551", "Syedarham@gmail.com");
        User u3 = new User(17, "Learner", "3007", "abdulrafay@gmail.com");

        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Available Vehicles:");
        for (Vehicles v : vehicles) {
            v.displayVehicles();
        }


        for (User user : users) {
            boolean vehicleAllotted = false;
            for (Vehicles v : vehicles) {
                if (user.getLicenseType().equalsIgnoreCase(v.getEligibility())) {
                    System.out.println("Vehicle Allotted to User: " + user.getUserId());
                    vehicles.remove(v);
                    user.setVehicleAllotted(true);
                    vehicleAllotted = true;
                    break;
                }
            }
            if (!vehicleAllotted) {
                System.out.println(user.getUserId() + ": Vehicle Not Allotted");
            }
        }
        int choiceInt = 0;
        do {
            System.out.println("Do you want to update information? (Y/N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Which user's information would you like to update?");
                System.out.println("1. "+u1.getUserId());
                System.out.println("2. "+u2.getUserId());
                System.out.println("3. "+u3.getUserId());
                System.out.println("4. Exit");
                choiceInt = sc.nextInt();
                if(choiceInt == 1) {
                    u1.UpdateInformation();
                }
                else if(choiceInt == 2) {
                    u2.UpdateInformation();
                }
                else if(choiceInt == 3) {
                    u3.UpdateInformation();
                }
            }
            else if (choice.equalsIgnoreCase("N")) {
                System.out.println("exiting program....");
                break;
            }
            if(choiceInt==4){
                System.out.println("exiting program....");
                break;
            }
        }while (choiceInt!=4);



    }
}
