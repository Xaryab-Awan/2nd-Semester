package Q6;

import java.util.Scanner;

public class Developer extends Employee{
    private String programming_language;
    private Boolean proficiency;

    public Developer(String employee_name, int employee_id, int salary, String programming_language) {
        super(employee_name, employee_id, salary);
        this.programming_language = programming_language;
    }
    public void Check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Developer proficient in Java? (Y/N)");
        String prof = sc.nextLine();
        if(prof.equalsIgnoreCase("Y")){
            System.out.println("Developer is proficient in Java");
            proficiency = true;
        }
        else {
            System.out.println("Developer is not proficient in Java");
            proficiency = false;
        }
    }
    public void DeveloperDetails() {
        super.Employee_details();
        System.out.println("Programming Language: " + programming_language);
        System.out.println("Proficiency: " + proficiency);
    }
}
