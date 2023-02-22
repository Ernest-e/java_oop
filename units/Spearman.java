package oop_java.units;

public class Spearman extends Warrior {
    public Spearman (String name){
        super(name, 130, 25, 15, 40, 1);
    }

    @Override
    public String getInfo() {
        return "Spearman " + name;
    }
    
    
}
