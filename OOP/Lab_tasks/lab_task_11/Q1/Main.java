package Q1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter element : " + (i + 1));
            int i1 = scanner.nextInt();
            arrayList.add(i1);
        }
            System.out.println(arrayList);


        try{
            File file =new File("C:\\Users\\student\\Desktop\\output.txt");
            BufferedWriter bf=new BufferedWriter(new FileWriter(file));
            for(int i=0;i<5;i++){
                bf.write(Integer.toString(arrayList.get(i)));
            }
            bf.close();
        }
        catch(IOException e){
            System.out.println("Error Writing File");
        }


    }
}
