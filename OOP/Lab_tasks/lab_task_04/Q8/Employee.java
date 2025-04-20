package Q8;

public class Employee {
   private String Name;
   private int Id;
   private String Department;

    Employee()
    {
        System.out.println("Default employee created:");
        Name="unknown";
        Id=0000;
        Department="not given";
    }
    Employee(String Name,int Id,String Department)
    {
        System.out.println("Employee Created:");
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
    public String getName()
    {
        return Name;
    }
    public int getId()
    {
        return Id;
    }
    public String getDepartment(){
        return Department;
    }

}
