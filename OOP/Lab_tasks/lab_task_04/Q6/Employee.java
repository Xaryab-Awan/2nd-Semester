package Q6;

public class Employee {
    String Name;
    int Id;
    String Department;

    Employee()
    {
        Name="default";
        Id=0000;
        Department="idk";
    }
    Employee(String Name,int Id,String Department)
    {
        this.Name=Name;
        this.Department=Department;
        this.Id=Id;
    }
    public void DisplayDetails()
    {
        System.out.println("Name: "+Name);
        System.out.println("Id: "+Id);
        System.out.println("Department: "+Department);
    }

}
