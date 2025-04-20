package Q8;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount(3000,3);
        System.out.println("Balance: "+savingAccount.getBalance());
        savingAccount.CalculateInterest(3.4);
        savingAccount.credit(200);
        System.out.println("Balance: "+savingAccount.getBalance());
        savingAccount.debit(1000);
        System.out.println("Balance: "+savingAccount.getBalance());
    }
}
