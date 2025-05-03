package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file =new File("Xaryabawan.txt");
        try
        {
            FileWriter writer =new FileWriter(file);
            writer.write("Name : Xaryab\n");
            writer.write("Age  : 19\n");
            writer.write("Qualification : UnderGrad\n");
            writer.close();
        }
        catch (IOException e){
            System.out.println("Error Writing File");
        }
        try{
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File Not found");
        }

    }
}
