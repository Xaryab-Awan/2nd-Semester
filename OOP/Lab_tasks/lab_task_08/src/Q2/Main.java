package Q2;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("xaryab","k243055@nu.edu.pk","03283414102","3055","SoftwareEngineering",3.63);
        Faculty f1=new Faculty("Arham","Syed.Arham@nu.edu.pk","0341009277","2551","ComputerScience","Lecturer");
        Staff st1=new Staff("Rafay","AbdulRafay@nu.edu.pk","024487399","3007","LabAssistant",3000);
        s1.Display();
        System.out.println("GPA"+s1.getGPA());
        f1.Display();
        System.out.println("Rank:"+f1.getRank());
        st1.Display();
        System.out.println("Salary:"+st1.getSalary());


    }
}
