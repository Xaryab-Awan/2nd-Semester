package Q4;

import java.util.ArrayList;

public class TA extends User{
    ArrayList<Student> students;
    ArrayList<String> projects;

    public TA(String name, int id, ArrayList<String> list_of_permissions, String email, String password, ArrayList<Student> assignStudents) {
        super(name, id, list_of_permissions, email, password);
        this.students = assignStudents;
        projects = new ArrayList<>();
    }

    @Override
    public void Display_details() {
        super.Display_details();
    }
    void assignStudent(Student s){
        if(students.size()>=10){
            System.out.println("Student limit reached");
        }
        else{
            students.add(s);
        }
    }
    public void workWithProfessor(String project){
        if(this.projects.size()>=2){
            System.out.println("Project limit reached");
        }
        else{
            this.projects.add(project);
            System.out.println("Started Working on Project");
        }
    }
}
