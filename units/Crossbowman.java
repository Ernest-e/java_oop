package oop_java.units;

public class Crossbowman extends Shooter {
    public Crossbowman (String name){
        super(name, 105, 35, 25, 45, 30);
    }
    
    @Override
    public String getInfo() {
        return "Crossbowman " + name;
    }
    
}
    

