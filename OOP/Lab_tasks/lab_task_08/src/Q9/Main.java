package Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] name = new String[]{"xaryab","arham"};
        Sorting sorting = new Sorting();
        sorting.sort(array);
        sorting.sort(name);
        sorting.sort(array,false);
        sorting.sort(name,false);
        
    }
}
