package Q3;

public class Main {
    public static void main(String[] args) {
        MovingRobot R1=new MovingRobot(3,3,'N');
        MovingRobot R2=new MovingRobot(2,3,'S');
        MovingRobot R3=new MovingRobot(4,1,'E');
        MovingRobot R4=new MovingRobot(5,2,'W');
        System.out.println("InitalPosition of R1");
        R1.InitialPosition();
        System.out.println("InitialPosition of R2");
        R2.InitialPosition();
        System.out.println("InitialPosition of R3");
        R3.InitialPosition();
        System.out.println("InitialPosition of R4");
        R4.InitialPosition();
        R1.MoveRobot(4);
        R2.MoveRobot(3);
        R3.MoveRobot(7);
        R4.MoveRobot(5);
        System.out.println("FinalPosition of R1");
        R1.updatedCordinates();
        System.out.println("FinalPosition of R2");
        R2.updatedCordinates();
        System.out.println("FinalPosition of R3");
        R3.updatedCordinates();
        System.out.println("FinalPosition of R4");
        R4.updatedCordinates();
    }
}
