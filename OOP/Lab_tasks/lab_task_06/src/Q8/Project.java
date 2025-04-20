package Q8;

public class Project {
    private String projectName;
    final String Deadline="31th March 2025";
    static int project_count;

    public Project(String projectName) {
        this.projectName = projectName;
        project_count++;
    }
    static void Project_count() {
        System.out.println("Project count: " + project_count);
    }
    public void Display_details() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Deadline: " + Deadline);
    }
}
