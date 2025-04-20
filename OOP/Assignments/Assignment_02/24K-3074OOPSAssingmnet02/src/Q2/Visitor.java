package Q2;

public class Visitor {
    private String name;
    private int bravery;

    Visitor(String name, int bravery) {
        this.name = name;
        if(bravery>=0 && bravery<=10) {
            this.bravery = bravery;
        }
        else {
            this.bravery=0;
        }
    }
}
