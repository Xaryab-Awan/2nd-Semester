package Q3;

public class Robot {
    private int x;
    private int y;
    private char Direction;

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.Direction = direction;
        if(!(this.Direction =='N'||this.Direction == 'S'||this.Direction == 'E'||this.Direction == 'W')){
            System.out.println("Invalid Direction");
        }
    }
    public void InitialPosition() {
        System.out.println("InitialPosition");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }

    public char getDirection() {
        return Direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(char direction) {
        Direction = direction;
    }
}
