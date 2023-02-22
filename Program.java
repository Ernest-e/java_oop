package oop_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import oop_java.units.Crossbowman;
import oop_java.units.Human;
import oop_java.units.Monk;
import oop_java.units.Peasant;
import oop_java.units.Robber;
import oop_java.units.Sniper;
import oop_java.units.Spearman;
import oop_java.units.Wizard;

public class Program {
    public static void main(String[] args) {
  
        List <Human> team = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            switch (new Random().nextInt(1, 7)) {
                case 1:
                    team.add(new Crossbowman(getName()));
                    break;
                case 2:
                    team.add(new Monk(getName()));
                    break;
                case 3:
                    team.add(new Peasant(getName()));
                    break;
                case 4:
                    team.add(new Robber(getName()));
                    break;
                case 5:
                    team.add(new Sniper(getName()));
                    break;
                case 6:
                    team.add(new Spearman(getName()));
                    break;
                case 7:
                    team.add(new Wizard(getName()));
                    break;
                default:
                    break;
            }
        }

        team.forEach(n -> System.out.println(n.getInfo()));
    }
        
    public static String getName(){
            return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        }
}

