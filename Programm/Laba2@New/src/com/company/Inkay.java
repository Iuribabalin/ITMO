package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Inkay extends Pokemon {
    public Inkay(String name, int level){
        super(name, level);

        this.setStats(53,54,53,37,46,45);
        this.setType(Type.DARK);

        this.setMove(new RockTomb(), new DoubleTeam(), new Confide());
    }
}
