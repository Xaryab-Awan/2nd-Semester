package Q6;

public class Main {
    public static void main(String[] args) {
        Employee E1=new Employee();
        E1.DisplayDetails();
        Employee E2=new Employee("Xaryab",3055,"Software Engineering");
        E2.DisplayDetails();
        Manager M1=new Manager("Zaryab",2231,"ComputerScience",3);
        M1.DisplayDetails();
    }
}
