package oop_java.units;

public class Peasant extends Human {
    protected int delivery;

    public Peasant(String name){
        super(name, 1, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s  delivery: %d", super.getInfo(), this.delivery);
    }
    
}
