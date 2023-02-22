package oop_java.units;

public class Wizard extends Magician{

    public Wizard (String name){
        super(name, 80, 40, 35, 10, 100, 15);
    }
    
    @Override
    public String getInfo() {
        return "Wizard " + name;
    }
    

}
