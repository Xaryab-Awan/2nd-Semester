package Q6;

public class SoftwareArchitect extends Developer{
    private int project_count;
    private Boolean eligible;
    public SoftwareArchitect(String employee_name, int employee_id, int salary, String programming_language, int project_count) {
        super(employee_name, employee_id, salary, programming_language);
        this.project_count = project_count;
    }
    public void Eligibility() {
        if(project_count>=5){
            System.out.println("The Software Architect has enough projects");
            eligible = true;
        }
        else {
            System.out.println("The Software Architect dont have enough projects");
            eligible = false;
        }
    }
    public void SoftwareArchitect_Details() {
        super.DeveloperDetails();
        System.out.println("Project Count: " + project_count);
        System.out.println("Eligible: " + eligible);
    }
}
