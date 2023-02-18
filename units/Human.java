package oop_java.units;

public abstract class Human {
    protected String name;
    protected int hp;
    protected int speed;
    protected int damage;
    protected int defense;

    public Human (String name, int hp, int damage, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Speed: %d Type: %s",
                this.name, this.hp, this.speed, this.getClass().getSimpleName());
    }
    
}






