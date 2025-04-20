package Q9;

public class Project_subclass extends Project_Superclass {
    String AIfeature;

    Project_subclass(String Name,String Deadline,long Budget,String AIfeature)
    {
        super(Name,Deadline,Budget);
        this.AIfeature=AIfeature;
    }
    void Display_Details()
    {
        super.DisplayDetails();
        System.out.println("AIfeature:"+AIfeature);
    }


}
