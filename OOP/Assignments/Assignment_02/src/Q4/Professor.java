package Q4;

import java.util.ArrayList;

public class Professor extends User{
    TA ta;

    public Professor(String name, int id, ArrayList<String> list_of_permissions, String email, String password) {
        super(name, id, list_of_permissions, email, password);
    }
    @Override
    public void Display_details(){
        System.out.println("Professor Details:");
        super.Display_details();
    }
    public void workOnTAProjects(TA ta) {
        this.ta = ta;
        System.out.println("TA Added");
        System.out.println("Started to Work with TA's on Projects");
    }

    public void assignProjects(String projectName, TA ta) {
        if(ta.projects.size()>=2){
            System.out.println("Project already assigned to TA");
        }
        else{
            ta.projects.add(projectName);
            System.out.println("Project Assingned to TA");
        }
    }
}
