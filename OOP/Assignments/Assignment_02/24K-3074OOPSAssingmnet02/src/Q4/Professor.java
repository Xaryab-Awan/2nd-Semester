package Q4;
import java.util.ArrayList;
import java.util.Arrays;

class  Professor extends User {
    TA ta;

    Professor(String name, int ID, ArrayList<String> permission, String email, String hashedPassword) {
        super(name,ID,permission,email,hashedPassword);
    }

    public void displayDetails() {
        System.out.println("Proffesor Details");
        super.displayInfo();
    }

    public void workOnTAProjects(TA ta) {
        this.ta = ta;
        System.out.println("TA Added");
        System.out.println("Started to Work with TA's on Projects");
    }

    public void assignProjects(String projectName, TA ta) {
        if(ta.project>=2){
            System.out.println("Project already assigned to TA");
        }
        else{
            System.out.println("Project Assingned to TA");
        }
    }
}
