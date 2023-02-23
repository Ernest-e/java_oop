package oop_java.units;

public abstract class Shooter extends Human {
    protected int shoots;

    public Shooter (String name, int hp, int attack, int minDamage, int maxDamage, int speed, int defense, int shoots){
        super(name, hp, attack, minDamage, maxDamage, defense, speed);
        this.shoots = shoots;
    }
    

}