package com.company;

import ru.ifmo.se.pokemon.Type;

public class Malamar extends Inkay {
    public Malamar(String name, int level) {
        super(name, level);

        this.setStats(86,92,88,68,75,73);
        this.setType(Type.DARK);

        addMove(new Barrier());
    }
}
