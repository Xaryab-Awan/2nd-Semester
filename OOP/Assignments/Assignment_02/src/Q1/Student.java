package Q1;
public class Student extends User {

    private double semesterBalance;

    public Student(int id, String name, String cardNumber, double balance, double semesterBalance) {
        super(id, name, cardNumber, balance);
        this.semesterBalance = semesterBalance;
    }

    @Override
    public void payFees() {
        processPayment(semesterBalance);
    }
}

