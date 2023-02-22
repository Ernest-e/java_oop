package oop_java.units;

public class Monk extends Magician {
    
    public Monk (String name){
        super(name, 75, 15, 35, 25, 100, 40);
    }
    
    @Override
    public String getInfo() {
        return "Monk " + name;
    }

}
