package oop_java.units;

import java.util.List;

public abstract class Human implements GameInterface {
    protected String name;
    protected int maxHp;
    protected double hp;
    protected int speed;
    protected int minDamage;
    protected int defense;
    protected int maxDamage;
    protected int attack;
    protected int xCoord;
    protected int yCoord;
    public int team;
    protected String state;

    public Human (String name, int maxHp, double hp, int attack, int minDamage, int maxDamage, int defense, int speed, int xCoord, int yCoord, int team) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.team = team;
        this.state = "Stand";
    }

    @Override
    public void step(List<Human> friends, List<Human> enemies){}
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %f  Attack: %d  minDamage: %d  maxDamage: %d  defense: %d  Speed: %d Type: %s  xCoord: %s  yCoord: %s  team: %d",
                this.name, this.hp, this.attack, this.minDamage, this.maxDamage, this.defense, this.speed, this.getClass().getSimpleName(), this.xCoord, this.yCoord, this.team);
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getHp(){
        return this.hp;
    }

    protected Human nearestHero (int x, int y, List<Human>lst){
        PointCoord myPos = new PointCoord(x, y);
        double minDist = PointCoord.distance(myPos, new PointCoord(lst.get(0).xCoord, lst.get(0).xCoord));
        Human nearestHero = lst.get(0);

        for (Human pers : lst) {
            PointCoord enemyPos = new PointCoord(pers.xCoord, pers.yCoord);

            if (PointCoord.distance(myPos, enemyPos) < minDist) {
                minDist = PointCoord.distance(myPos, enemyPos);
                nearestHero = pers;
            }
        }
        return nearestHero;
    }

    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp >= maxHp) hp = maxHp;
    }
}







