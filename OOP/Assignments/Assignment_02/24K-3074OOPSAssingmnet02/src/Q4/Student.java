package Q4;
import java.util.*;

public class Student extends User {
    ArrayList<String> assignment=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    Student(String name, int ID, ArrayList<String> permission, String email, String hashedPassword, ArrayList<String> assignment) {
        super(name,ID,permission,email,hashedPassword);
        this.assignment=assignment;
    }

    void submitAssignment(ArrayList<String> assignment) {
        System.out.println("1 for assignment sumbitted\n0 for assingment left\n-1 to exit");
        int counter=0;
        for(int i=0; ;i++) {
            counter++;
            System.out.println("Assignemnt "+counter+": ");
            String answer=sc.nextLine();
            if(answer.equals("-1")){
                break;
            }
            else{
                assignment.add(answer);
            }


        }
    }

    void addAssignment(String assignment) {
        this.assignment.add(assignment);
    }

    void updateAssignment(ArrayList<String> assignment) {
        System.out.println("1 for assignment sumbitted\n0 for assingment left\n-1 to exit");
        int counter=0;
        for(String s:assignment){
            counter++;
            System.out.println("Assignemnt "+counter+": ");
            String answer=sc.nextLine();
            if(answer.equals("-1")){
                break;
            }
            else{
                assignment.add(answer);
            }
        }
    }

    @Override
    void displayInfo(){
        System.out.println("Student Information");
        super.displayInfo();

    }

    void displayAssignment(ArrayList<String> assignment) {
        System.out.println("Assignments---> 1 submitted, 0---->Left");
        for(String s:assignment){
            System.out.println(s);
        }
    }
}
