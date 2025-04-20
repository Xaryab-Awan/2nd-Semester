package Q3;

public class Solution {
    private String solutionText;
    private Participants participant;
    private Problem problem;
    private boolean isCorrect;
    public Solution(String solutionText, Participants participant, Problem problem) {
        this.solutionText = solutionText;
        this.participant = participant;
        this.problem = problem;
        this.isCorrect = false;
    }
    public void evaluate(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    public void display() {
        System.out.println("Problem: " + problem.getStatement());
        System.out.println("Solution: " + solutionText);
        System.out.println("Status: " + (isCorrect ? "Correct" : "Incorrect"));
    }
}