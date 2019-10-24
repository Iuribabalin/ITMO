package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vanillite extends Pokemon {
    public Vanillite(String name, int level){
        super(name, level);

        this.setStats(36,50,50,65,60,44);
        this.setType(Type.ICE);

        this.setMove(new AerialAce(), new DoubleTeam());

    }

}
