package oop_java.units;

import java.util.List;

public abstract class Shooter extends Human {
    protected int shoots;

    public Shooter (String name, int maxHp, double hp, int attack, int minDamage, int maxDamage, int speed, int defense, int shoots, int xCoord, int yCoord, int team){
        super(name, maxHp, hp, attack, minDamage, maxDamage, defense, speed, xCoord, yCoord, team);
        this.shoots = shoots;
    }

    @Override
    public void step (List<Human> friends, List<Human> enemies) {
        if (this.state.equals("Die") || this.shoots == 0) return;
        
        else {
            Human enemy = nearestHero(this.xCoord, this.yCoord, enemies);
            float damage = (enemy.defense - this.attack)>0 ? this.minDamage : (enemy.defense - this.attack) < 0 ? this.maxDamage : (this.minDamage + this.maxDamage)/2;
            enemy.getDamage(damage);

            int shootDecrease = 1; 
            for (Human human : friends) {
                if (human.getClass().getSimpleName().equals("Peasant") && human.state.equals("Stand")){
                    human.state = "Busy";
                    shootDecrease = 0;
                    return;
                }
            }
            if (shootDecrease == 1) {this.shoots--;}

        }

    }


    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " Shots:" + shoots + " " +
                state;
    }

}