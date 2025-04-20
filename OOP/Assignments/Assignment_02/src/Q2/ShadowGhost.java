package Q2;

public class ShadowGhost extends Ghost {

    public ShadowGhost(String name, int scaryLevel) {
        super(name, scaryLevel);
    }

    @Override
    void ghostHaunts(){
        super.ghostHaunts();
        System.out.println(name + " Whispers Creepily with a scare level of " + scaryLevel + "!");
    }
}
