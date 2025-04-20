package Q4;

import java.util.ArrayList;

public class Instructor {
    private String Name;
    private String Department;
    ArrayList<Course> c;

    Instructor(String Name, String Department) {
        this.Name = Name;
        this.Department = Department;
        c = new ArrayList<>();
    }

    void TeachCourse(Course x) {
        c.add(x);
    }

    String getName() {
        return Name;
    }

    String getDepartment() {
        return Department;
    }

    void Display() {
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Department);
        for (Course course : c) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Course Name: " + course.getCourseName());
        }
    }
}