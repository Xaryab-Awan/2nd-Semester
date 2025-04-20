package Q2;

public class Student {
    String Name;
    int Id;
    float Gpa;

    Student()
    {
        Name="Default Name";
        Id=0000;
        Gpa=0.0f;
        System.out.println("Name: "+Name);
        System.out.println("Id: "+Id);
        System.out.println("Gpa: "+Gpa);
    }
    Student(String Name,int Id,float Gpa){
        this.Name=Name;
        this.Id=Id;
        this.Gpa=Gpa;
        System.out.println("Name: "+Name);
        System.out.println("Id: "+Id);
        System.out.println("Gpa: "+Gpa);
    }
    public void finalize()
    {
        System.out.println("Student Record Deleted ,"+ Id+" "+Name);

    }
}
