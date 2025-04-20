package Q8;

public class Manager extends Employee {
    int teamSize;

    Manager(String Name,int Id,String Department,int teamSize){
        super(Name,Id,Department);
        this.teamSize=teamSize;
    }
    void Display_Details(){
        super.DisplayDetails();
        System.out.println("Manager Created:");
        System.out.println(super.getName()+" manages team of "+teamSize+" members");
    }
}
