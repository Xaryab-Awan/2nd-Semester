package Q3;
import java.util.*;

class Company {
    String CompanyName;
    String IndustryType;
    String JobRole;
    ArrayList <String> requiredSkills=new ArrayList<>();
    ArrayList <String> studentsInterviewed=new ArrayList<>();

    Company(String CompanyName,String IndustryType,String JobRole,ArrayList <String> requiredSkills) {
        this.CompanyName = CompanyName;
        this.JobRole = JobRole;
        this.IndustryType = IndustryType;
        this.requiredSkills = requiredSkills;
    }

    void ScheduleInterview(Student student){
        if(student.skills.containsAll(requiredSkills))
        {
            studentsInterviewed.add(student.name);
        }

    }
    void DisplayDetails()
    {
        System.out.println("Name: "+CompanyName);
        System.out.println("IndustryType: "+ IndustryType);
        System.out.println("Job Role: "+JobRole);
        System.out.println("Required Skills: "+requiredSkills);
        System.out.println("Students Interviewed: "+studentsInterviewed);
    }



}
