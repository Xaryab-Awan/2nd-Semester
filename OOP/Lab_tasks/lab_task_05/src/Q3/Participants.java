package Q3;

import java.util.ArrayList;

public class Participants {
    private String name;
    private ArrayList<Competition> competitions;
    private ArrayList<Solution> solutions;

    public Participants(String name) {
        this.name = name;
        this.competitions = new ArrayList<>();
        this.solutions = new ArrayList<>();
    }
    public void registerForCompetition(Competition competition) {
        if (!competitions.contains(competition)) {
            competitions.add(competition);
            competition.getParticipants().add(this);
        }
    }
    public void submitSolution(Problem problem, Solution solution) {
        problem.getSolutions().add(solution);
        solutions.add(solution);
    }
    public void display() {
        System.out.println("\nParticipant: " + name);
        System.out.println("Competitions Registered: " + competitions.size());
        System.out.println("Solutions Submitted: " + solutions.size());
    }
}