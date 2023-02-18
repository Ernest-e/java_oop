package oop_java;

import oop_java.units.Robber;
import oop_java.units.Warrior;
import oop_java.units.Wizard;

public class Program {
    public static void main(String[] args) {
        Wizard James  = new Wizard("James");
        Warrior Joe = new Robber("Joe");

        System.out.println(Joe.getInfo());
    }
}
