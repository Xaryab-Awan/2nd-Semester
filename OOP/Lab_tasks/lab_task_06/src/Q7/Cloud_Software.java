package Q7;

public class Cloud_Software extends Licensed_Software{
    private final int Total_Storage=100;
    private int used_storage;

    public Cloud_Software(String name, String version, String license_key, int expiry_date, int used_storage) {
        super(name, version, license_key, expiry_date);
        this.used_storage = used_storage;
    }
    public void remaining_storage() {
        int temp=Total_Storage-used_storage;
        System.out.println("Remaining Storage: "+temp);
    }
    public void Cloud_Software_Details() {
        super.Software_Details();
        System.out.println("used Storage: "+used_storage);
    }
}
