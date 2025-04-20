package Q3;

public class Warrior extends Character{
    void SpecialAbility(){
        this.attackPower=this.attackPower*2;
        System.out.println(" Warrior's Attack Power Doubled");
    }

    public Warrior(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }

}
