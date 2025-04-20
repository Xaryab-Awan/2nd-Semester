package Question_2;

public class Goal {
    private final int x = 3;
    private final int y = 3;

    public boolean isGoalReached(int x,int y){
        if(this.x==x && this.y==y){
            return true;
        }
        else
        {
            return false;
        }
    }
}
