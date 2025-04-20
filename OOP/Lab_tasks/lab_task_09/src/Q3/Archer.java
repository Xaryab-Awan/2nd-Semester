package Q3;

public class Archer extends Character{
    public Archer(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }
    void SpecialAbility(){
        this.attackPower=this.attackPower+15;
        System.out.println("Archer's Attack Power Increased by 15");
    }
}
