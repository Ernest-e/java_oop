package oop_java.units;

import java.util.List;

public abstract class Warrior extends Human {


    public Warrior (String name, int maxHp, double hp, int attack, int minDamage, int maxDamage, int speed, int defense, int xCoord, int yCoord, int team){
        super(name, maxHp, hp, attack, minDamage, maxDamage, defense, speed, xCoord, yCoord, team);
     
    }
    

    @Override
    public void step(List<Human> friends, List<Human> enemies) {
        if (!this.state.equals("Die")){
            Human enemy = nearestHero(this.xCoord, this.yCoord, enemies);
            PointCoord enemyPoint = new PointCoord(enemy.xCoord, enemy.yCoord);
            PointCoord myPoint = new PointCoord(this.xCoord, this.yCoord);
            double dist = PointCoord.distance(myPoint, enemyPoint);
            if (dist >= 2){
                PointCoord toGo = myPoint.choiceWay(enemyPoint);
                if (Math.abs(toGo.x) > Math.abs(toGo.y)) {
                    if (toGo.x < 0) {
                        this.xCoord += 1;
                    } else if (toGo.x > 0) {
                        this.xCoord -= 1;
                    }
                } else {
                    if (toGo.y < 0) {
                        this.yCoord += 1;
                    } else if (toGo.y > 0) {
                        this.yCoord -= 1;
                    }
                }
            }
            else {
                float damage = (enemy.defense - this.attack)>0 ? this.minDamage : (enemy.defense - this.attack) < 0 ? this.maxDamage : (this.minDamage + this.maxDamage)/2;
                enemy.getDamage(damage);
            }
        }

    }

}

    

