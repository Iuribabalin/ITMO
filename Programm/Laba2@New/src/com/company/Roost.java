package com.company;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    Roost(){
        super(Type.FLYING,0,0);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.condition(Status.NORMAL);
        att.addEffect(effect);
    }

    protected String describe() {
        return "Roost attack";
    }

}
