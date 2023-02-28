package oop_java.units;

import java.util.ArrayList;
import java.util.List;

public abstract class Shooter extends Human {
    protected int shoots;

    public Shooter (String name, int hp, int attack, int minDamage, int maxDamage, int speed, int defense, int shoots, int xCoord, int yCoord, int team){
        super(name, hp, attack, minDamage, maxDamage, defense, speed, xCoord, yCoord, team);
        this.shoots = shoots;
    }

    @Override
    public void step (List<Human> allHeroes) {
        if (this.hp == 0) {
            System.out.println("Лучник мертв");
        }
        else if (this.shoots == 0){
            System.out.println("Стрелы закончились");
        }
        else {
            List<Human> enemies = new ArrayList<>();
            List<Human> friends = new ArrayList<>();
            for (Human human : allHeroes) {
                if (this.team == human.team){
                    friends.add(human);
                }
                else {enemies.add (human);}
            }
            Human enemy = nearestHero(this.xCoord, this.yCoord, enemies);
            System.out.println("nearest enemy" + enemy.getInfo());
            enemy.hp -= this.minDamage;

            int shootDecrease = 1; 
            for (Human human : friends) {
                if (human.getClass().getSimpleName().equals("Peasant")){
                    shootDecrease = 0;
                }
            if (shootDecrease == 1) {this.shoots-=1;}
            }

        }

    }

}