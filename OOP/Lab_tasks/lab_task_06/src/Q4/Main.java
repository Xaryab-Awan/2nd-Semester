package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of weeks: ");
        int w = sc.nextInt();
        int[][] attendance = new int[m][w];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < w; j++){
                int temp=0;
                System.out.println("Enter Attendance for Student #"+(i+1)+" for Week # :"+(j+1));
                System.out.println("0 for absent and 1 for present:");
                temp=sc.nextInt();
                if(!(temp==0 || temp==1)){
                    System.out.println("invalid input");
                    j--;
                    continue;
                }
                attendance[i][j] = temp;
            }
        }
        int[] present = new int[m];
        int[] absent = new int[m];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < w; j++){
                if(attendance[i][j]==1){
                    present[i]++;
                }
                else if(attendance[i][j]==0){
                    absent[i]++;
                }
            }
        }

        int total_present=0;
        int total_absent=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<w;j++){
                if(attendance[i][j]==1){
                    total_present++;
                }
                else if(attendance[i][j]==0){
                    total_absent++;
                }
            }
        }
        int avg_present=total_present/m;
        int avg_absent=total_absent/m;
        int best_present=present[0];
        int best_absent=present[0];
        for(int i = 0; i < m; i++)
        {
            if(best_present<present[i]){
                best_present=present[i];
            }
        }
        for(int i = 0; i < m; i++){
            if(best_absent<absent[i]){
                best_absent=absent[i];
            }
        }
        for(int i = 0; i < m; i++)
        {
            System.out.println("Number of Presents for Student #"+(i+1)+" :"+present[i]);
            System.out.println("Number of Absents for Student #"+(i+1)+" :"+absent[i]);
        }
        System.out.println("Total number of presents : "+total_present);
        System.out.println("Total number of absent : "+total_absent);
        System.out.println("Average number of presents : "+avg_present);
        System.out.println("Average number of absent : "+avg_absent);
        for(int i = 0; i < m; i++){
            if(best_present==present[i]){
                System.out.println("Student #"+(i+1)+" has the best attendance");
                break;
            }
        }
        for(int i = 0; i < m; i++){
            if(best_absent==absent[i]){
                System.out.println("Student #"+(i+1)+" has the worst attendance");
                break;
            }
        }


    }
}
