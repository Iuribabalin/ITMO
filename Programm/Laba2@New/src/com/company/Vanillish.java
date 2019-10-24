package com.company;

import ru.ifmo.se.pokemon.Type;

public class Vanillish extends Vanillite {
    public Vanillish(String name, int level){
        super(name, level);

        this.setStats(51,65,65,80,75,59);
        this.setType(Type.ICE);

        addMove(new DreamEater());
    }
}
