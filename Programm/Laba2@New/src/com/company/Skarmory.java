package com.company;
// test completed
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skarmory extends Pokemon {
    public Skarmory(String name, int level){
        super(name, level);

        this.setStats(65,80,140,40,70,70);
        this.setType(Type.FLYING);

        this.setMove(new AncientPower(), new PowerWhip(), new SleepPowder(), new Slam());
    }
}
