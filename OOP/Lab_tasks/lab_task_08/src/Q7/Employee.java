package Q7;

public class Employee {
    public void PerformanceAssessment(){
        System.out.println("Performance Assessment Done for Employee");
    }
    public void PerformanceAssessment(int innovationScores,String feedback){
        System.out.println("Performance Assessment Done for Employee with innovations Scores of "+innovationScores+"and feedback: "+feedback);

    }
    public void PerformanceAssessment(String innovationScores,String feedback,String LeadershipSkills){
        System.out.println("Performance Assessment Done for Employee with innovations Scores of "+innovationScores+"and feedback: "+feedback);
        System.out.println("Employee is nominated for promotion with leadership skills: "+LeadershipSkills);
    }
}
