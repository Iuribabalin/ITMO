package com.company;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {

    public AncientPower(){super(Type.GROUND,60,100);}

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon att){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.stat(Stat.ATTACK, +2);
        effect.stat(Stat.DEFENSE, +2);
        effect.stat(Stat.SPECIAL_ATTACK, +2);
        effect.stat(Stat.SPECIAL_DEFENSE, +2);
        effect.stat(Stat.SPEED, +2);
        att.addEffect(effect);
    }

    protected String describe() {
        return "Ancient Power attack - уууууу с ноги тебе в лицо";
    }

}
