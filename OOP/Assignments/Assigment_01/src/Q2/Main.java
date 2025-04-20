package Q2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Football Game Simulator!!");
        Robot R1=new Robot("Cristiano");
        Robot R2=new Robot("Messi");
        Team t1=new Team("Portugal",R1);
        Team t2=new Team("Argentina",R2);
        Game G=new Game(t1,t2);
        G.startGame();
    }
}
