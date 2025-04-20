package Q2;

public class Person {
    protected String name;
    protected String email;
    protected String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String toString() {
        return super.toString() + "\tName: " + name + "\tEmail: " + email + "\tPhone: " + phone;
    }
    public void Display() {
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone:"+phone);
    }
}
