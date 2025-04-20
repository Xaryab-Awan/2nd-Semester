package Q6;

public class ProjectManager extends SoftwareEngineer{
    @Override
    public void assignTask(String name,String Deadline){
        System.out.println("Project Manager has assigned urgent task");
        System.out.println(name+ " is assigned task within deadline of "+Deadline);
    }
}
