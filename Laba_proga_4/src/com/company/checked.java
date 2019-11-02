package com.company;

public class checked {
    boolean ourHero(String NameHero) {
        boolean flag = false;
        if (!(!(NameHero.equals("Карлсон")) && !(NameHero.equals("Малыш")))){
            flag = true;
        }
        return flag;
    }
}
