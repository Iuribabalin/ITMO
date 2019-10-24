package com.company;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon t1_1 = new Skarmory("Новенький", 1);
        Pokemon t1_2 = new Inkay("Шарит", 1);
        Pokemon t1_3 = new Malamar("Профи", 1);

        Pokemon t2_1 = new Vanillite("Рома", 1);
        Pokemon t2_2 = new Vanilluxe("Алексей", 1);
        Pokemon t2_3 = new Vanillish("Декан", 1);

        b.addAlly(t1_1);
        b.addAlly(t1_2);
        b.addAlly(t1_3);

        b.addFoe(t2_1);
        b.addFoe(t2_2);
        b.addFoe(t2_3);


        b.go();

    }
}
