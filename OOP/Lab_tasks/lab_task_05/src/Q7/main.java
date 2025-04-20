package Q7;

public class main {
    public main() {
    }

    public static void main(String[] var0) {
        Team var1 = new Team("Quetta Gladiator", "Pakistan", "Sir Viv Richard");
        var1.addPlayer(new Player("Jason Roy", "Batsman", 90));
        var1.addPlayer(new Player("Muhammad Amir", "Bowler", 85));
        var1.addPlayer(new Player("Akeal Hosein", "All-Rounder", 83));
        var1.addPlayer(new Player("Sarfaraz Ahmed", "Wicket-Keeper Batsman", 80));
        var1.generateReport();
    }
}

