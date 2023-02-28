package oop_java.units;

public class Peasant extends Human {
    protected int delivery;

    public Peasant(String name, int xCoord, int yCoord, int team){
        super(name, 1, 1, 1, 1, 1, 3, xCoord, yCoord, team);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s  delivery: %d", super.getInfo(), this.delivery);
    }
    
}
