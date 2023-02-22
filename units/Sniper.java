package oop_java.units;

public class Sniper extends Shooter {
    public Sniper (String name){
        super(name, 90, 25, 35, 35, 20);
    }
    
    @Override
    public String getInfo() {
        return "Sniper " + name;
    }
    
}
