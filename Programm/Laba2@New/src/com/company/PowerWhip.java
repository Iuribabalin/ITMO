package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PowerWhip extends PhysicalMove {
    PowerWhip(){
        super(Type.GRASS,120,85);
    }

    protected String describe() {
        return "Power Whip attack - Мощь травки";
    }
}
