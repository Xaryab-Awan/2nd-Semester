package Question_2;
import java.util.*;

public class Game {
    private Team teamOne;
    private Team teamTwo;
    private Ball ball;
    private Goal goal;

    Game(Team teamOne,Team teamTwo){
        this.ball = new Ball();
        this.goal = new Goal();
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    public void startGame(){
        System.out.println("Game Start! Score the Goal with least hits. Goal at(3,3)");
        play(teamOne);
        ball = new Ball();
        play(teamTwo);
        declare_winner();
    }

    public void play(Team team){
        Scanner sc = new Scanner(System.in);
        System.out.println(team.getName()+ " is playing!");
        while (!goal.isGoalReached(ball.getX(), ball.getY())){
            String move;
            System.out.println("Enter your choice: ");
            System.out.println("(Up)--(Down)--(Left)--(Right)");
            move = sc.nextLine();
            team.getPlayer().hitBall(ball, move);
            System.out.println(team.getName()+" moved the ball "+move+". New coordinates("+ball.getX()+")("+ball.getY()+")");
        }
        System.out.println(team.getName()+" reached goal with "+team.getPlayer().getHits()+" hits!");
    }

    public void declare_winner(){
        if(teamOne.getPlayer().getHits()<teamTwo.getPlayer().getHits()){
            System.out.println(teamOne.getName()+" Won the match with "+teamOne.getPlayer().getHits()+" hits!");
        } else if (teamTwo.getPlayer().getHits()<teamOne.getPlayer().getHits()) {
            System.out.println(teamTwo.getName()+" Won the match with "+teamTwo.getPlayer().getHits()+" hits!");
        }
        else {
            System.out.println("It is a tie!");
        }
    }
}
