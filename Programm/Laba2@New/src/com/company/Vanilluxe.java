package com.company;

import ru.ifmo.se.pokemon.Type;

public class Vanilluxe extends Vanillish {
    public Vanilluxe(String name, int level) {
        super(name, level);

        this.setStats(71,95,85,110,95,79);
        this.setType(Type.ICE);

        addMove(new Roost());
    }
}
