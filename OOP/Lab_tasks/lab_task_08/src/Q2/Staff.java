package Q2;

public class Staff extends Person {
    private String staffID;
    private String Jobtitle;
    private int salary;

    public Staff(String name, String email, String phone, String staffID, String jobtitle, int salary) {
        super(name, email, phone);
        this.staffID = staffID;
        this.Jobtitle = jobtitle;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Staff ID:"+staffID);
        System.out.println("Jobtitle:"+Jobtitle);
    }
}
