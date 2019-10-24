package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove {
    Slam(){
        super(Type.NORMAL,80,75);
    }

    protected String describe() {
        return "Slam attack";
    }
}
