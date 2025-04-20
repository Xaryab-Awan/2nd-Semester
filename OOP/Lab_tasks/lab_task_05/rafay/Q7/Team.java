package Q7;
import java.util.ArrayList;

class Team {
    private String Name;
    private ArrayList<Player> players;

    // Constructor
    Team(String Name) {
        this.Name = Name;
        players = new ArrayList<>();
    }

    // Method to add a player to the team
    void AddPlayer(Player p) {
        players.add(p);
    }
    void Display() {
        System.out.println("Team: " + Name);
        System.out.println("Players:");
        for (Player p : players) {
            p.Display();
        }
    }

    // Getter for players
    public ArrayList<Player> getPlayers() {
        return players;
    }
}