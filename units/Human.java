package oop_java.units;

import java.util.List;

public abstract class Human implements GameInterface {
    protected String name;
    protected int hp;
    protected int speed;
    protected int minDamage;
    protected int defense;
    protected int maxDamage;
    protected int attack;
    protected int xCoord;
    protected int yCoord;
    protected int team;

    public Human (String name, int hp, int attack, int minDamage, int maxDamage, int defense, int speed, int xCoord, int yCoord, int team) {
        this.name = name;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.team = team;
    }

    @Override
    public void step(List<Human> allHeroes){}
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Attack: %d  minDamage: %d  maxDamage: %d  defense: %d  Speed: %d Type: %s  xCoord: %s  yCoord: %s",
                this.name, this.hp, this.attack, this.minDamage, this.maxDamage, this.defense, this.speed, this.getClass().getSimpleName(), this.xCoord, this.yCoord);
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getHp(){
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
}






