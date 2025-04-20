package Q8;

public class Main {
    public static void main(String[] args) {
        Employee E1=new Employee();
        E1.DisplayDetails();
        Employee E2=new Employee("Arham",2551,"ComputerScience");
        E2.DisplayDetails();
        Manager E3=new Manager("Xaryab",3055,"SoftwareEngineering",5);
        E3.Display_Details();


    }
}
