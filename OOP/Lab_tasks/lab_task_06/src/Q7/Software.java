package Q7;

public class Software {
    private String name;
    private String version;
    private String license_key;

    public Software(String name, String version, String license_key) {
        this.name = name;
        this.version = version;
        this.license_key = license_key;
    }
    public void Software_Details() {
        System.out.println("Name: "+name);
        System.out.println("Version: "+version);
        System.out.println("License Key: "+license_key);
    }
}
