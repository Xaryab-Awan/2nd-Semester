package Q10;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<String> Students=new ArrayList<>();
        int temp=0;
        do {
            System.out.println(" 1) Register \n 2) Withdraw \n 3)update \n 4)Display list \n 5) exit");
            System.out.println("Enter your choice:");
            int choice=a.nextInt();
            a.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the Student Name:");
                    Students.add(a.nextLine());
                    break;
                }
                case 2: {
                    String name;
                    System.out.println("Enter the Student Name:");
                    name = a.nextLine();
                    if(Students.remove(name))
                    {
                        Students.remove(name);
                    }
                    else {
                        System.out.println("Student Not Found !!!");

                    }
                    break;

                }
                case 3:
                {
                    String name;
                    System.out.println("Enter the Student Name:");
                    name = a.nextLine();
                    if(Students.contains(name))
                    {
                        String updated_name;
                        System.out.println("Enter updated name:");
                        updated_name=a.nextLine();
                        Students.set(Students.indexOf(name),updated_name);
                    }
                    else {
                        System.out.println("Student Not found!!!");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Current list:");
                    for(String student: Students)
                    {
                        System.out.println(student);
                    }
                    break;
                }

                default:
                {
                    temp=3;
                    break;
                }
            }

        }while(temp !=4);
    }
}
