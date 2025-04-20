package Q4;

public class StaffMember extends User{
    private String department;

    public StaffMember(int id, String name, String cardNumber, double balance, String department) {
        super(id, name, cardNumber, balance);
        this.department = department;
    }

    @Override
    public void payFees() {
        processPayment(500); // Assuming a fixed fee
    }
}
