package Q3;

public class Mage extends Character {
    public Mage(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }
    void SpecialAbility(){
        this.attackPower=this.attackPower+20;
        System.out.println(" Mage's Attack Power Increased By 20");
    }
}
