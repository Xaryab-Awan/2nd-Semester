package Q9;

public class Main {
    public static void main(String[] args) {
        Project_Superclass P1=new Project_Superclass("CyberSecurity","tommorow",3000);
        P1.DisplayDetails();
        Project_subclass P2=new Project_subclass("Artificial Itelligence","30th Jan",3000,"Teleportation");
        P2.Display_Details();
    }
}
