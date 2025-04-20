package Q6;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.assignTask("Xaryab","3 hours");
        developer.assignTask("Arham","5 hours","urgent");
        developer.assignTask("Uzair","7 hours","not urgent","5 hours");
        SoftwareEngineer softwareEngineer=new SoftwareEngineer();
        softwareEngineer.assignTask("Saad","10 days");
        SoftwareEngineer teamLead=new TeamLead();
        SoftwareEngineer projectManager=new ProjectManager();
        teamLead.assignTask("Abdullah","4 hours");
        projectManager.assignTask("Rafay","6 hours");
    }
    //Overloading is done in Developer class because a developer can be assigned task with different parameters
    //Overriding is used because sub_classes have different assign task methods to deal with
}
