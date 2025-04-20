package Q7;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("babar", "batsman", "GHANYTE KA KING");
        Player p2 = new Player("rizwan", "batsman/wicketkeeper", "YA TU WIN YA TU LEARN");
        Player p3 = new Player("khushdil", "allrounder", "PARCHI");


        Team pak = new Team("Pakistan");

        pak.AddPlayer(p1);
        pak.AddPlayer(p2);
        pak.AddPlayer(p3);

        pak.Display();
    }
}