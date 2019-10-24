package com.company;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    DreamEater(){
        super(Type.PSYCHIC,100,100);
    }

    protected String describe() {
        return "Dream Eater attack - 100 по 100";
    }
}
