package Q2;

public class ShadowPoltergeist extends Ghost{

    ShadowPoltergeist(String name,int scaryLevel){
        super(name,scaryLevel);
    }

    @Override
    void ghostHaunts(){
        System.out.println(name + " is whispering creepily and moving objects with a scare level of " + scaryLevel + "!");
    }
}
