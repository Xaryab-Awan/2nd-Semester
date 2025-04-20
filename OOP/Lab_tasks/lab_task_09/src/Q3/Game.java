package Q3;

public class    Game {
    public static void main(String[] args) {
        Character w1=new Warrior(100,40,"Warrior");
        Character m1=new Mage(100,50,"Mage");
        Character a1=new Archer(100,60,"Archer");
        w1.SpecialAbility();
        w1.attack(m1);
        m1.SpecialAbility();
        m1.attack(w1);
        a1.SpecialAbility();
        a1.attack(m1);
    }
}
