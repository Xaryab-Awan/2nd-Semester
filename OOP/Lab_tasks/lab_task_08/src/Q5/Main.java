package Q5;

public class Main {
    public static void main(String[] args) {
        Event event=new Event();
        Event s1=new SpeedProgramming();
        Event w1=new WebDevelopment();
        Event c1=new CyberSecurity();
        Event b1=new BusinessCase();
        Event a1=new AIChallenge();
        s1.Schedule();
        w1.Schedule();
        c1.Schedule();
        b1.Schedule();
        a1.Schedule();
    }
}
