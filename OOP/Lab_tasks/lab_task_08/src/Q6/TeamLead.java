package Q6;

public class TeamLead extends SoftwareEngineer{
    @Override
    public void assignTask(String name,String Deadline){
        System.out.println("Team Lead is reviewing the task, checking dependencies, and approving it");
        System.out.println(name+ " is assigned task within deadline of "+Deadline);
    }
}
