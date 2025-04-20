package Q4;

public class Employee {
    int Id;
    String Name;
    long BasicSalary;
    long TaxDeduction;
    long Bonus;
    double NetSalary;

    Employee(){
        System.out.println("Default Employee Created ");
        Id=0000;
        Name="Unknown";
        BasicSalary=0;
        TaxDeduction=0;
        Bonus=0;
        NetSalary=0;
    }
    Employee(int Id,String Name,long BasicSalary,long TaxDeduction,long Bonus)
    {
        System.out.println("New Employee created");
        this.Id=Id;
        this.Name=Name;
        this.BasicSalary=BasicSalary;
        this.Bonus=Bonus;
        NetSalary=BasicSalary-0.01*BasicSalary+Bonus;
    }
    Employee(int Id,String Name,long BasicSalary,long TaxDeduction)
    {
        this.Id=Id;
        this.Name=Name;
        this.BasicSalary=BasicSalary;
        NetSalary=BasicSalary-0.01*BasicSalary+Bonus;
    }



    public void DisplayDetails()
    {
        System.out.println("Id: "+Id);
        System.out.println("Name: "+Name);
        System.out.println("BasicSalary: "+BasicSalary);
        System.out.println("Bonus: "+Bonus);
        System.out.println("NetSalary: "+NetSalary);
    }
    public void finalize()
    {
        System.out.println("Employee Deleted "+Id);
        System.out.println("Memory for Bonus Released");
    }
}
