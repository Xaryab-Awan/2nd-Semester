package Q2;

public class Student extends Person {
    private String stdID;
    private String major;
    private double  GPA;

    public Student(String name, String email, String phone, String stdID, String major, double GPA) {
        super(name, email, phone);
        this.stdID = stdID;
        this.major = major;
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println("Student ID:"+stdID);
        System.out.println("Major:"+major);
    }
}
