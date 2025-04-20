package Q3;

public abstract class Character {
    protected int health;
    protected int attackPower;
    protected String name;

    public Character(int health, int attackPower, String name) {
        this.health = health;
        this.attackPower = attackPower;
        this.name = name;
    }

    abstract void SpecialAbility();
    void attack(Character c){
        System.out.println(this.name+" is attacking " +c.name);
        c.health=(c.health-this.attackPower);
    }
    void defend(){
        System.out.println(this.name+" is Defending itself");
    }

}
