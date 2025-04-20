package Q4;

public class Course {
    private String CourseCode;
    private String CourseName;
    private int CreditHours;
    public void setValues(String CourseCode, String CourseName, int CreditHours) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        if (CreditHours > 0 && CreditHours < 4) {
            this.CreditHours = CreditHours;
        } else {
            this.CreditHours = 0;
        }
    }
    void getValues() {
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Credit Hours: " + CreditHours);
    }
}



