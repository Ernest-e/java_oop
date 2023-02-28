package oop_java.units;

public abstract class Magician extends Human {
    protected int mana;

    public Magician (String name, int hp, int attack, int minDamage, int maxDamage, int speed, int defense, int mana, int xCoord, int yCoord, int team){
        super(name, hp, attack, minDamage, maxDamage, defense, speed, xCoord, yCoord, team);
        this.mana = mana;

    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d", super.getInfo(), this.mana);
    }
    


}
