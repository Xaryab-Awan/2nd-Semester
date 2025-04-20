package Q2;

public class Ghost {
    protected String name;
    protected int scaryLevel;

    Ghost(String name, int scaryLevel) {
        this.name = name;
        if(scaryLevel>=0 && scaryLevel<=10) {
            this.scaryLevel = scaryLevel;
        }
        else {
            this.scaryLevel = 0;
        }
    }

    void ghostHaunts() {
        System.out.println("Ghost Starts Haunting");
    }

    void displayGhostInfo(){
        System.out.println("Ghost Player's Name: " + this.name);
        System.out.println("Ghost Scary Level: " + this.scaryLevel);
    }

    public void upgradeGhost(String secondName,int scaryLevel) {
        this.name += " and " + secondName;
        this.scaryLevel += scaryLevel;
        System.out.println("Ghost upgraded! New scare level: " + this.scaryLevel);
    }
}
