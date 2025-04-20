package Q7;

public class JuniorDevelopers extends Employee{
    @Override
    public void PerformanceAssessment(int CompletedProjects,String CodeQuality){
        System.out.println("Performance Assessment Done for Junior Employee with "+CompletedProjects+" completed projects and "+CodeQuality+" code Quality");

    }
}
