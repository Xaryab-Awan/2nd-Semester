package Question_2;
import java.util.*;

public class Football_game_simulator {
    public static void main(String[] args){
        System.out.println("Football Game Simulator!");
        Robot r1 = new Robot("Cristiano Ronaldo");
        Robot r2 = new Robot("Leonal Messi");

        Team team1 = new Team("Real Madrid",r1);
        Team team2 =  new Team("Argentina",r2);

        Game playing = new Game(team1,team2);
        playing.startGame();
    }
}
