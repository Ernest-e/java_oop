package oop_java.units;

import java.util.List;

public class Peasant extends Human {
    protected int delivery;

    public Peasant(String name, int xCoord, int yCoord, int team){
        super(name,1, 1, 1, 1, 1, 1, 3, xCoord, yCoord, team);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s  delivery: %d", super.getInfo(), this.delivery);
    }
    
    // степ крестьян - если не труп то state = "Stand"
    @Override
    public void step (List<Human> friends, List<Human> enemies) {
        if (!this.state.equals("Die")) {
            this.state = "Stand";
        }
    }



}
