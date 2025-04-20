package Q9;

import com.sun.security.jgss.GSSUtil;

public class Project_Superclass {
    String Name;
    String Deadline;
    long Budget;

    Project_Superclass(String Name,String Deadline,long Budget)
    {
        this.Name=Name;
        this.Budget=Budget;
        this.Deadline=Deadline;
    }
    public void DisplayDetails()
    {
        System.out.println("Name: "+Name);
        System.out.println("Deadline: "+Deadline);
        System.out.println("Budget: "+Budget);
    }
}
