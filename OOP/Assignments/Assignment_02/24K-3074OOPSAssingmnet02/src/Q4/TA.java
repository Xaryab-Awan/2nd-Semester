package Q4;
import java.util.*;

public class TA extends User{

    private List<Student> student;
     int project;


    TA(String name, int ID, ArrayList<String> permission, String email, String hashedPassword,List<Student> student,int project) {
        super(name, ID, permission, email, hashedPassword);
        this.student = new ArrayList<>();
        this.project = project;
    }

    @Override
    void displayInfo(){
        System.out.println("TA's Information");
        super.displayInfo();
    }

    void assingStudent(Student s){
        if(student.size()>=10){
            System.out.println("Student limit reached");
        }
        else{
            student.add(s);
        }
    }

    void workWithProfessor(int project){
        if(this.project>=2){
            System.out.println("Project limit reached");
        }
        else{
            this.project = project;
            System.out.println("Started Working on Project");
        }
    }
}
