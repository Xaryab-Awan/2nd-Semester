package Q2;

public class Poltergeist extends Ghost{


    public Poltergeist(String name, int scaryLevel) {
    super(name, scaryLevel);
    }

    @Override
    void ghostHaunts(){
        super.ghostHaunts();
        System.out.println(name + " moving objects with a scare level of " + scaryLevel + "!");
    }
}
