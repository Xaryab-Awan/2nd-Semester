package Q3;

import java.util.ArrayList;

public class Competition {
    private ArrayList<Problem> problems;
    private ArrayList<Participants> participants;

    public Competition() {
        this.problems = new ArrayList<>();
        this.participants = new ArrayList<>();
    }
    public void addProblem(Problem problem) {
        problems.add(problem);
    }
    public ArrayList<Participants> getParticipants() {
        return participants;
    }
    public ArrayList<Problem> getProblems() {
        return problems;
    }
    public void display() {
        System.out.println("Competition Details:");
        System.out.println("Number of Problems: " + problems.size());
        System.out.println("Number of Participants: " + participants.size());
    }
}