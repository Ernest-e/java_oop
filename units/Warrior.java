package oop_java.units;

public abstract class Warrior extends Human {

    protected int blades;

    public Warrior (String name, int hp, int damage, int speed, int defense, int blades){
        super(name, hp, damage, defense, speed);
        this.blades = blades;
    }
    
    public String getInfo() {
        return String.format("%s  blade nums: %d", super.getInfo(), this.blades);
    }

}

    

