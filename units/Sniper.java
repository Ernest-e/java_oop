package oop_java.units;

public class Sniper extends Shooter {
    public Sniper (String name){
        super(name, 15, 12, 8, 10, 9, 10, 32);
    }
    

    @Override
    public String getInfo() {
        return String.format("%s  shoots: %d", super.getInfo(), this.shoots);
    }
}
