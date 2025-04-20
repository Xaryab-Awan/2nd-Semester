package Q2;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    ArrayList<Course> courses;
    Student(String name,String id){
        this.name=name;
        this.id=id;
        courses=new ArrayList<>();
    }
    void enrollInCourse(Course c){
        courses.add(c);
        c.students.add(this);
    }
    void completeAssighment(Course c) {
        Assighment assignment = c.getAssighment();
        if (assignment != null) {
            assignment.assignmentdone();
        } else {
            System.out.println("No assignment found for this course.");
        }
    }
    void Display(){
        System.out.println("Student Name:"+name);
        System.out.println("Student ID:"+id);
        for(Course x:courses){
            x.Display();
        }
    }

}
