package Question_2;

public class Robot {
    private String name;
    private int hits;

    Robot(String name){
        this.name = name;
        this.hits = 0;
    }

    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void hitBall(Ball ball,String direction){
        if(direction.equalsIgnoreCase("left"))
        {
            ball.move(-1,0);
        } else if (direction.equalsIgnoreCase("right")) {
            ball.move(1,0);
        }
        else if(direction.equalsIgnoreCase("up")){
            ball.move(0,1);
        } else if (direction.equalsIgnoreCase("down")) {
           ball.move(0,-1);
        }
        else {
            System.out.println("Invalid Move!");
        }
            this.hits++;
    }


}
