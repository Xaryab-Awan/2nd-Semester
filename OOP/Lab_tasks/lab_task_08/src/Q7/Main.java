package Q7;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.PerformanceAssessment();
        employee.PerformanceAssessment(3,"Good");
        employee.PerformanceAssessment("3","Excellent","Great");
        Employee S1=new SeniorDevelopers();
        Employee J1=new JuniorDevelopers();
        Employee P1=new ProjectManagers();
        S1.PerformanceAssessment("Great","Average","Average");
        J1.PerformanceAssessment(3,"Great");
        P1.PerformanceAssessment("succesfull","Manageable","Good");
    }
}
