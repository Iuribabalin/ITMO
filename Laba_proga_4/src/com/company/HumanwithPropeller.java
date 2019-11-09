package com.company;

class HumanwithPropeller extends Human {
    private String messang = null;

    HumanwithPropeller(String name) {
        super(name,"");
    }

    String fly(String place) throws FlyException{
        int a = (int) (Math.random()*2);
        if (a == 1){
            throw new FlyException("\n''Я заглох, сейчас надо смазать пропеллер''\n");
        }
        this.messang = this.getName() + " улетел с ним на " + place + ".\n";
        return this.messang;
    }

}
