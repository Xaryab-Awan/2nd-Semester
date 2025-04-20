package Question_2;

public class Team {
    private String name;
    private Robot player;

    Team(String name,Robot player){
        this.name = name;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot getPlayer() {
        return player;
    }

    public void setPlayer(Robot player) {
        this.player = player;
    }
}
