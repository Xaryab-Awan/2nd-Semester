package Q4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    protected String name;
    protected int ID;
    protected ArrayList<String> permission;
    protected String email;
    protected int hashedPassword;

    User(String name, int ID, ArrayList<String> permission, String email, String hashedPassword) {
        this.name = name;
        this.ID = ID;
        this.permission = new ArrayList<>();
        this.email = email;
        this.hashedPassword = generateHashedPassword(hashedPassword);
    }

    int generateHashedPassword(String password) {
        int hash=5381;

        for(char ch : password.toCharArray()) {
            hash=(hash*31)+ch;
        }

        return hash;
    }

    boolean authenticate(String password) {
        if(hashedPassword==generateHashedPassword(password)) {
            return true;
        }
        else{
            return false;
        }
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Permissions: "+permission);
        System.out.println("Email: "+email);
    }

    void accessLab(ArrayList<String> permission) {
        for(String s : permission) {
            if(this.permission.contains("accessLab")) {
                System.out.println("Access to Lab Granted ");
            }else{
                System.out.println("Access to Lab Denied ");
            }
        }

    }
}
