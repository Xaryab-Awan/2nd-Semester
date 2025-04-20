package Q2;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private String studentID;
    ArrayList<Course> enrolledCourses;

    Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        enrolledCourses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.students.add(this);
    }

    void completeAssignment(Course course) {
        Assignment assignment = course.getAssignment();
        if (assignment != null) {
            assignment.assignmentdone();
        } else {
            System.out.println("No assignment found for this course.");
        }
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        for (Course course : enrolledCourses) {
            course.displayCourseDetails();
        }
    }
}
