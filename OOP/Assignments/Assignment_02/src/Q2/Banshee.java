package Q2;

public class Banshee extends Ghost{

    public Banshee(String name, int scaryLevel) {
        super(name, scaryLevel);
    }

    @Override
    void ghostHaunts(){
        super.ghostHaunts();
        System.out.println(name + "Screams Loudly with a scare level of " + scaryLevel + "!");
    }
}
