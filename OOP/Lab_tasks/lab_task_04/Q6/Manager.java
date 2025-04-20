package Q6;
public class Manager extends Employee {
    int teamSize;

    Manager(String Name,int Id,String Department,int teamSize)
    {
        super(Name,Id,Department);
        this.teamSize=teamSize;

    }
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("TeamSize:"+teamSize);
    }
}
