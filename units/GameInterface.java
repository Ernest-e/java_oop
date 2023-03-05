package oop_java.units;

import java.util.List;

public interface GameInterface {
    void step(List<Human> friends, List<Human> enemies);
    String getInfo();
}
