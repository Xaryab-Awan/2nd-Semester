import java.util.ArrayList;

public class Q2 {
    static public void main(String[] args)
    {
        ArrayList<String> todo_list= new ArrayList<>();
        todo_list.add("PLay Football");
        todo_list.add("Eat");
        todo_list.add("Pray");
        System.out.println("Before Removing 'Play Football':");
        System.out.println(todo_list);
        System.out.println("After Removing 'Play Football':");
        todo_list.remove(0);
        System.out.println(todo_list);

    }
}
