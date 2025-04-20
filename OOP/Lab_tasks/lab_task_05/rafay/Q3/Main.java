package Q3;

public class Main {
    public static void main(String[] args) {
        Competition c1 = new Competition();
        Competition c2 = new Competition();

        Problem p1 = new Problem("Sort an array", "Easy", c1);
        Problem p2 = new Problem("Implement a linked list", "Medium", c1);
        Problem p3 = new Problem("Solve a dynamic programming problem", "Hard", c2);

        c1.addProblem(p1);
        c1.addProblem(p2);
        c2.addProblem(p3);

        Participants pa1 = new Participants("Abdul Rafay");
        Participants pa2 = new Participants("Bisma");
        Participants pa3 = new Participants("xaryab");

        pa1.registerForCompetition(c1);
        pa2.registerForCompetition(c1);
        pa2.registerForCompetition(c2);
        pa3.registerForCompetition(c2);

        Solution s1 = new Solution("Bubble sort", pa1, p1);
        Solution s2 = new Solution("Merge sort", pa1, p1);
        Solution s3 = new Solution("Linked list implementation", pa2, p2);
        Solution s4 = new Solution("Dynamic programming solution", pa2, p3);
        Solution s5 = new Solution("Quick sort", pa3, p1);

        pa1.submitSolution(p1, s1);
        pa1.submitSolution(p1, s2);
        pa2.submitSolution(p2, s3);
        pa2.submitSolution(p3, s4);
        pa3.submitSolution(p1, s5);

        s1.evaluate(true);
        s2.evaluate(false);
        s3.evaluate(true);
        s4.evaluate(true);
        s5.evaluate(true);

        System.out.println("===== Competition 1 Details =====");
        c1.display();
        System.out.println("\n===== Competition 2 Details =====");
        c2.display();

        System.out.println("\n===== Participant Progress =====");
        pa1.display();
        pa2.display();
        pa3.display();

        System.out.println("\n===== Problem Details =====");
        p1.display();
        p2.display();
        p3.display();
    }
}