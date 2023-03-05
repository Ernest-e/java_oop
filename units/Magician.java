package oop_java.units;

import java.util.List;

public abstract class Magician extends Human {
    protected int mana;

    public Magician (String name, int maxHp, int hp, int attack, int minDamage, int maxDamage, int speed, int defense, int mana, int xCoord, int yCoord, int team){
        super(name, maxHp, hp, attack, minDamage, maxDamage, defense, speed, xCoord, yCoord, team);
        this.mana = mana;

    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d", super.getInfo(), this.mana);
    }




    // если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
    @Override
    public void step(List<Human> friends, List<Human> enemies){
        if (!this.state.equals("Die")){
            Human target = sickestHero(friends);
            target.getDamage(this.maxDamage);
        }

    }
    
    

    protected Human sickestHero (List<Human> lst){
        double maxDiffHp = 0;
        Human sickestHero = lst.get(0);

        for (Human pers : lst) {
            double diffHp = pers.maxHp - pers.getHp();
            if (diffHp > maxDiffHp) {
                maxDiffHp = diffHp;
                sickestHero = pers;
            }
        }
        return sickestHero;
    }

}
