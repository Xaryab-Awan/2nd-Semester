package Q7;

import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;
    private String country;
    private String coach;
    private List<Player> players;

    public Team(String var1, String var2, String var3) {
        this.name = var1;
        this.country = var2;
        this.coach = var3;
        this.players = new ArrayList();
    }

    public void addPlayer(Player var1) {
        this.players.add(var1);
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCoach() {
        return this.coach;
    }

    public void generateReport() {
        System.out.println("Team Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Coach: " + this.coach);
        System.out.println("Players:");

        for(Player var2 : this.players) {
            System.out.println("  Name: " + var2.getName());
            System.out.println("  Role: " + var2.getRole());
            System.out.println("  Performance Stats: " + var2.getPerformanceStats());
        }

    }
}
