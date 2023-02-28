package oop_java;

import java.util.ArrayList;
import java.util.Comparator;
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
  
        List <Human> blue = new ArrayList<>();
        List <Human> red = new ArrayList<>();

        makeTeam(red, 10, 1, 5);
        makeTeam(blue, 10, 5, 9);

        List <Human> heroes = new ArrayList<>();
        heroes.addAll(red);
        heroes.addAll(blue);
        heroes.sort(new Comparator<Human> () {
            @Override
            public int compare (Human o1, Human o2){
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp()-o1.getHp();
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
        
        System.out.println("blue team:");
        blue.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-----------------");
        System.out.println("red team:");
        red.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-----------------");
        System.out.println("all sorted by speed:");
        heroes.forEach(n -> System.out.println(n.getInfo()));


        

    }


        




        
    public static String getName(){
            return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        }

    public static void makeTeam(List<Human> list, int units, int minnum, int maxnum){
        for (int i = 0; i < units; i ++){
            switch (new Random().nextInt(minnum, maxnum)) {
                case 1:
                    list.add(new Robber(getName(), 0, i+1, 1));
                    break;
                case 2:
                    list.add(new Sniper(getName(),  0, i+1, 1));
                    break;
                case 3:
                    list.add(new Wizard(getName(),  0, i+1, 1));
                    break;
                case 4:
                    list.add(new Peasant(getName(),  0, i+1, 1));
                    break;
                case 5:
                    list.add(new Spearman(getName(), 10, i+1, 2 ));
                    break;
                case 6:
                    list.add(new Crossbowman(getName(), 10, i+1, 2));
                    break;
                case 7:
                    list.add(new Monk(getName(), 10, i+1, 2));
                    break;
                case 8:
                    list.add(new Peasant(getName(),  10, i+1, 2));
                    break;
                default:
                    break;
            }
        }
    }
    
}

