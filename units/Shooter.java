package oop_java.units;

public abstract class Shooter extends Human {
    protected int weapons;

    public Shooter (String name, int hp, int damage, int speed, int defense, int weapons){
        super(name, hp, damage, defense, speed);
        this.weapons = weapons;
    }
    
    public String getInfo() {
        return String.format("%s  weapons: %d", super.getInfo(), this.weapons);
    }

}