package Q2;
import java.util.*;

import java.util.ArrayList;

public class HauntedHouse {
    private String name;
    List<ShadowGhost> shadowGhost=new ArrayList<>();
    List<Poltergeist> poltergeist=new ArrayList<>();
    List<Banshee> banshee=new ArrayList<>();

    public HauntedHouse(String name) {
        this.name = name;
    }

    void addGhost(ShadowGhost ghost) {
        shadowGhost.add(ghost);
    }

    void addGhost(Poltergeist ghost) {
        poltergeist.add(ghost);
    }

    void addGhost(Banshee ghost) {
        banshee.add(ghost);
    }
}
