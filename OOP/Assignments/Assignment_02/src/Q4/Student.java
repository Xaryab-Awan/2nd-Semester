package Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User{
    ArrayList<String> Assignments;
    public Student(String name, int id, ArrayList<String> list_of_permissions, String email, String password) {
        super(name, id, list_of_permissions, email, password);
        Assignments=new ArrayList<>();
    }

    @Override
    public void Display_details() {
        System.out.println("Student Details");
        super.Display_details();
    }
    public void AddAssignment(String assignment) {
    Assignments.add(assignment);
    }
    public void updateAssignment(ArrayList<String> assignment) {
        System.out.println("1 for assignment sumbitted\n0 for assingment left\n-1 to exit");
        int counter=0;
        for(String s:Assignments){
            counter++;
            System.out.println("Assignemnt "+counter+": ");
            Scanner sc=new Scanner(System.in);
            String answer=sc.nextLine();
            if(answer.equals("-1")){
                break;
            }
            else{
                assignment.add(answer);
            }
        }
    }
    public void displayAssignment() {
        System.out.println("Assignments---> 1 submitted, 0---->Left");
        for(String s:Assignments){
            System.out.println(s);
        }
    }

}
