package com.company;

import ru.ifmo.se.pokemon.*;

public class Barrier extends StatusMove {
    Barrier(){
        super(Type.PSYCHIC,0,0);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.stat(Stat.DEFENSE, +6);
        att.addEffect(effect);
    }
    protected String describe() {
        return "Rock Tomb attack - Ты не пройдёшь";
    }
}
