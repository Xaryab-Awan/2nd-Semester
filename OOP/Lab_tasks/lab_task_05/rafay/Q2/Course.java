package Q2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    ArrayList<Student> students;
    List<String> instructors;
    private Assighment assighment;

    Course(String CourseName,String CourseCode,List<String> ins){
        this.courseName=CourseName;
        this.courseCode=CourseCode;
        this.instructors=ins;
        students=new ArrayList<>();
    }
    void addAssighmnet(Assighment a){
        this.assighment=a;
    }
    public Assighment getAssighment() {
        return assighment;
    }
    void Display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        if (assighment != null && !assighment.isCompleted()) {
            System.out.println("Do your Assignment before the due date:");
            assighment.Display();
        } else if (assighment != null) {
            System.out.println("Assignment is already completed.");
        } else {
            System.out.println("No assignment found for this course.");
        }
    }
}
