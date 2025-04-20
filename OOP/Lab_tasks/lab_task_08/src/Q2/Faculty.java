package Q2;

public class Faculty extends Person {
    private String facultyID;
    private String department;
    private String rank;

    public Faculty(String name, String email, String phone, String facultyID, String department, String rank) {
        super(name, email, phone);
        this.facultyID = facultyID;
        this.department = department;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Faculty ID:"+facultyID);
        System.out.println("Department:"+department);
    }
}
