package Q4;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    protected String name;
    protected int id;
    protected ArrayList<String> List_of_permissions;
    protected String email;
    protected int hashedPassword;

    public int calculateHashedPassword(String password) {
        int hash=5381;
        for(char ch : password.toCharArray()) {
            hash=hash*33+ch;
        }
        return hash;
    }
    boolean authenticate(String password) {
        if(hashedPassword==calculateHashedPassword(password)) {
            return true;
        }
        else{
            return false;
        }
    }
    public User(String name, int id, ArrayList<String> list_of_permissions, String email, String password) {
        this.name = name;
        this.id = id;
        this.List_of_permissions = list_of_permissions;
        this.email = email;
        this.hashedPassword = calculateHashedPassword(password);
    }
    public void Display_details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("List of permissions: " + List_of_permissions);
        System.out.println("Email: " + email);
        System.out.println("Password: " + hashedPassword);
    }
    public void Access_lab(){
        if(Arrays.asList(List_of_permissions).contains("LabAccess")) {
            System.out.println("Access lab access");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
