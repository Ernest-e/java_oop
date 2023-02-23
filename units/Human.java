package oop_java.units;

public abstract class Human implements GameInterface {
    protected String name;
    protected int hp;
    protected int speed;
    protected int minDamage;
    protected int defense;
    protected int maxDamage;
    protected int attack;

    public Human (String name, int hp, int attack, int minDamage, int maxDamage, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    @Override
    public void step(){}
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Attack: %d  minDamage: %d  maxDamage: %d  defense: %d  Speed: %d Type: %s",
                this.name, this.hp, this.attack, this.minDamage, this.maxDamage, this.defense, this.speed, this.getClass().getSimpleName());
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getHp(){
        return this.hp;
    }
}






