package Q3;

import java.util.ArrayList;

public class Problem {
    private String statement;
    private String difficultyLevel;
    private Competition competition;
    private ArrayList<Solution> solutions;

    public Problem(String statement, String difficultyLevel, Competition competition) {
        this.statement = statement;
        this.difficultyLevel = difficultyLevel;
        this.competition = competition;
        this.solutions = new ArrayList<>();
    }
    public String getStatement() {
        return statement;
    }
    public String getDifficultyLevel() {
        return difficultyLevel;
    }
    public ArrayList<Solution> getSolutions() {
        return solutions;
    }
    public void display() {
        System.out.println("Problem Statement: " + statement);
        System.out.println("Difficulty Level: " + difficultyLevel);
        System.out.println("Number of Solutions: " + solutions.size());
    }
}