package oop_java.units;

public abstract class Magician extends Human {
    protected int mana;
    protected int healing;

    public Magician (String name, int hp, int damage, int speed, int defense, int mana, int healing){
        super(name, hp, damage, defense, speed);
        this.mana = mana;
        this.healing = healing;
    }
    


}
