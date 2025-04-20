package Q7;

public class Licensed_Software extends Software{
    private int Expiry_date;

    public Licensed_Software(String name, String version, String license_key, int expiry_date) {
        super(name, version, license_key);
        this.Expiry_date = expiry_date;
    }
    public void Check_expiry_date(int current_date) {
        int temp=Expiry_date%100;
        int temp1=current_date%100;
        if(temp1==temp || temp1>temp){
            System.out.println("You are Good");
        }
        else {
            System.out.println("You are expired");
        }
    }
    public void Licensed_Software_Details() {
        super.Software_Details();
        System.out.println("Expiry Date: "+Expiry_date);
    }
}
