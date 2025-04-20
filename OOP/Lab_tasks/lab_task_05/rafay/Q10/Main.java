package Q10;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            System.out.print("Enter the number of weeks: ");
            int numWeeks = scanner.nextInt();

            int[][] attendance = new int[numStudents][numWeeks];

            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < numWeeks; j++) {
                    System.out.print("Enter attendance for student " + (i + 1) + " in week " + (j + 1) + " (1 for present, 0 for absent): ");
                    attendance[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nAttendance Records:");
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Student " + (i + 1) + ": ");
                for (int j = 0; j < numWeeks; j++) {
                    System.out.print(attendance[i][j] + " ");
                }
                System.out.println();
            }

            int[] studentTotalAttendance = new int[numStudents];
            int[] weeklyAttendance = new int[numWeeks];

            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < numWeeks; j++) {
                    studentTotalAttendance[i] += attendance[i][j];
                    weeklyAttendance[j] += attendance[i][j];
                }
            }

            System.out.println("\nTotal Attendance for Each Student:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Student " + (i + 1) + ": " + studentTotalAttendance[i]);
            }

            System.out.println("\nWeekly Attendance Across All Students:");
            for (int j = 0; j < numWeeks; j++) {
                System.out.println("Week " + (j + 1) + ": " + weeklyAttendance[j]);
            }

            double totalClassAttendance = 0;
            for (int i = 0; i < numStudents; i++) {
                totalClassAttendance += studentTotalAttendance[i];
            }
            double averageClassAttendance = totalClassAttendance / (numStudents * numWeeks);
            System.out.println("\nAverage Class Attendance: " + averageClassAttendance);

            int bestStudent = 0;
            int worstStudent = 0;
            for (int i = 1; i < numStudents; i++) {
                if (studentTotalAttendance[i] > studentTotalAttendance[bestStudent]) {
                    bestStudent = i;
                }
                if (studentTotalAttendance[i] < studentTotalAttendance[worstStudent]) {
                    worstStudent = i;
                }
            }
            System.out.println("\nStudent with Best Attendance: Student " + (bestStudent + 1) + " (" + studentTotalAttendance[bestStudent] + " days present)");
            System.out.println("Student with Worst Attendance: Student " + (worstStudent + 1) + " (" + studentTotalAttendance[worstStudent] + " days present)");

        }
    }