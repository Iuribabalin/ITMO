package com.company;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    RockTomb(){
        super(Type.ROCK,60,95);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect();
        effect.stat(Stat.SPEED, -6);
        def.addEffect(effect);
    }

    protected String describe() {
        return "Rock Tomb attack - так стопэ документики";
    }
}
