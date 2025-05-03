package Q4;

import java.util.Scanner;

class Login<T> {
    private T storedUsername;
    private T storedPassword;

    public Login(T username, T password) {
        this.storedUsername = username;
        this.storedPassword = password;
    }

    public void authenticate(T inputUsername, T inputPassword) {
        if (storedUsername.equals(inputUsername) && storedPassword.equals(inputPassword)) {
            System.out.println("Login successful. Welcome!");
        } else {
            System.out.println("Invalid username or password. Program terminated.");
            System.exit(0);
        }
    }
}
