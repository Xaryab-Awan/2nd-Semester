package Q7;

public class Project {
    String ProjectName;
    String Deadline;
    long Budget;

    Project()
    {
        ProjectName="Untitled Project";
        Deadline="NotAssigned";
        Budget=0;
        System.out.println("Default Project created: "+ProjectName+", " +Deadline+", Budget:$"+Budget);
    }
    Project(String ProjectName,String Deadline)
    {
        this.ProjectName=ProjectName;
        this.Deadline=Deadline;
        System.out.println("Project created: "+ProjectName+", " +Deadline);

    }
    Project(String ProjectName,String Deadline,long Budget)
    {
        this.ProjectName=ProjectName;
        this.Deadline=Deadline;
        this.Budget=Budget;
        System.out.println("Project created: "+ProjectName+", " +Deadline+", Budget:$"+Budget);
    }

}
