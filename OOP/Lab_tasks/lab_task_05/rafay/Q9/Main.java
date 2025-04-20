package Q9;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double[] grades = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter grade for student " + (i + 1) + " (0-100): ");
                double grade = scanner.nextDouble();

                if (grade >= 0 && grade <= 100) {
                    grades[i] = grade;
                    sum += grade;
                    break;
                } else {
                    System.out.println("Invalid grade! Please enter a valid grade between 0 and 100.");
                }
            }
        }

        double average = sum / n;
        double highest = grades[0];
        double lowest = grades[0];
        int aboveAverageCount = 0;

        for (double grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
            if (grade > average) aboveAverageCount++;
        }

        System.out.println("\nClass Statistics:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Number of students above the average: " + aboveAverageCount);

    }
}


