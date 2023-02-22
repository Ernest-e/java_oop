package oop_java.units;

public class Peasant extends Human {
    public Peasant(String name){
        super(name, 60, 5, 5, 25);
    }

    @Override
    public String getInfo() {
        return "Peasant " + name;
    }
    
}
