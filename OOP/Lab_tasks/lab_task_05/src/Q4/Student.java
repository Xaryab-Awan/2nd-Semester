package Q4;
import java.util.ArrayList;

public class Student {
    private String RollNo;
    private String name;
    private String Program;
    private ArrayList<Course> c;
    Student(String RollNo,String Name,String prog){
        this.name=Name;
        this.RollNo=RollNo;
        this.Program=prog;
        c=new ArrayList<>();
    }
    void EnrollToCourse(Course course){
        c.add(course);
    }
    void Display(){
        System.out.println("NAME:"+name);
        System.out.println("Roll no:"+RollNo);
        System.out.println("Program:"+Program);
    }
}
