package com.company;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    Confide(){
        super(Type.NORMAL,0,0);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applyOppEffects(Pokemon def){
        Effect effect = new Effect();
        effect.stat(Stat.SPECIAL_ATTACK, -6);
        def.addEffect(effect);
    }

    protected String describe() {
        return "Confide attack - Отдохни от специального";
    }
}
