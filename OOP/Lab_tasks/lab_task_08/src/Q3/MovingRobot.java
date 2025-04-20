package Q3;

public class MovingRobot extends Robot{
    public MovingRobot(int x, int y, char direction) {
        super(x, y, direction);
    }
    public void MoveRobot(int steps) {
        if(this.getDirection() == 'N') {
            this.setY(getY() + steps);

        }
        else if(this.getDirection() == 'S') {
            this.setY(getY() - steps);
        }
        else if(this.getDirection() == 'E') {
            this.setX(getX() + steps);
        }
        else if(this.getDirection() == 'W') {
            this.setX(getX() - steps);
        }

    }
    public void updatedCordinates(){
        System.out.println("X:"+this.getX());
        System.out.println("Y:"+this.getY());
    }
}
