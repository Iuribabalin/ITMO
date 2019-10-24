package com.company;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    SleepPowder(){
        super(Type.GRASS,0,75);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect();
        Effect.sleep(def);
        def.addEffect(effect);
    }

    protected String describe() {
        return "Sleep Powder attack - Приляг отдохни";
    }
}
