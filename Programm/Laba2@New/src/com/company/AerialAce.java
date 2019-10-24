package com.company;

        import ru.ifmo.se.pokemon.PhysicalMove;
        import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    AerialAce(){
        super(Type.FLYING,60,1000000000);
    }

    protected String describe() {
        return "Aerial Ace attack - я не промахнусь";
    }
}
