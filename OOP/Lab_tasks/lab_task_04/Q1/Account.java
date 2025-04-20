package Q1;

public class Account {
    String CustomerName;
    long AccountNumber;
    long AccountBalance;

    Account(String CustomerName,long AccountNumber,long AccountBalance)
    {
        this.CustomerName=CustomerName;
        this.AccountBalance=AccountBalance;
        this.AccountNumber=AccountNumber;
        System.out.println("CustomerName:"+CustomerName);
        System.out.println("AccountNumber: "+AccountNumber);
        System.out.println("AccountBalance: "+AccountBalance);
    }
    Account()
    {
        CustomerName="Zaryab";
        AccountNumber=0002;
        AccountBalance=2000;
        System.out.println("CustomerName:"+CustomerName);
        System.out.println("AccountNumber: "+AccountNumber);
        System.out.println("AccountBalance: "+AccountBalance);
    }
    public void finalize()
    {
        System.out.println("Account "+AccountNumber+" Deleted");
    }
}
