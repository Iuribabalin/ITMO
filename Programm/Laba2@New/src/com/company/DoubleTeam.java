package com.company;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    DoubleTeam(){
        super(Type.NORMAL,0,0);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.stat(Stat.SPEED, +6);
        att.addEffect(effect);
    }
    protected String describe() {
        return "Rock Tomb attack - Не поймаешь чёрт";
    }
}
