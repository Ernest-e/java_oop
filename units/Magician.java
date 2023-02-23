package oop_java.units;

public abstract class Magician extends Human {
    protected int mana;

    public Magician (String name, int hp, int attack, int minDamage, int maxDamage, int speed, int defense, int mana){
        super(name, hp, attack, minDamage, maxDamage, defense, speed);
        this.mana = mana;

    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d", super.getInfo(), this.mana);
    }
    


}
