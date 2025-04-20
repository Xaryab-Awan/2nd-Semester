package Q8;

public class SavingAccount extends Account {
    private int timeSpan;
    private double interest;
    public SavingAccount(double balance, int timeSpan) {
        super(balance);
        this.timeSpan = timeSpan;
    }
    public void CalculateInterest(double interestRate){
        this.interest = interestRate * this.timeSpan;
    }
    @Override
    public void credit(double money) {
        super.credit(money+this.interest);

    }
}
