package Q4;

import java.util.ArrayList;

public class Course {
    private String CourseCode;
    private String CourseName;
    private Instructor instructor; // Instructor for this course
    ArrayList<Student> s;

    public Course(String name, String Code) {
        this.CourseCode = Code;
        this.CourseName = name;
        s = new ArrayList<>();
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    void assignInstructor(Instructor ins) {
        this.instructor = ins; // Assign the instructor to the course
        ins.TeachCourse(this); // Add the course to the instructor's list
    }

    void addStudent(Student std) {
        s.add(std);
        std.EnrollToCourse(this);
    }

    void display() {
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Course Name: " + CourseName);
        if (instructor != null) {
            System.out.println("INSTRUCTOR: " + instructor.getName() + " (" + instructor.getDepartment() + ")");
        } else {
            System.out.println("INSTRUCTOR: Not assigned");
        }
        for (Student student : s) {
            student.Display();
        }
        System.out.println();
    }
}