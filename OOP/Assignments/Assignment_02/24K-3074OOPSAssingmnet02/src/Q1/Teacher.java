package Q4;

public class Teacher extends User{


    private double monthlySalary;

    public Teacher(int id, String name, String cardNumber, double balance, double monthlySalary) {
        super(id, name, cardNumber, balance);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void payFees() {
        processPayment(monthlySalary);
    }


}
