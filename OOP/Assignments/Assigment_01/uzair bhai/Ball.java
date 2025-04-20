package Question_2;

public class Ball {
    private int x;
    private int y;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0;
        this.y = 0;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void move(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }

    public int[] getPosition(){
        return new int[]{x,y};
    }
}
