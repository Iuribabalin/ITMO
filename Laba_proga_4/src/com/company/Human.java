package com.company;

abstract class Human implements IHuman {
    private final String Name;
    private String ParamDo ;
    private String messang;

    Human(String name, String Do) {
        Name = name;
        ParamDo = Do;
    }

    public String getName(){
        return Name;
    }

    void speak(){
        System.out.print("Затем все произошло точь-в-точь так, как сказал " + this.getName() + "\n");
    }

    void sighed(){}

    void waked(){
        System.out.print("Прежде чем " + this.getName() + " успел опомнился" + ", ");
    }

    String fly(String place) throws FlyException{
        int a = (int) (Math.random()*2);
        if (a == 1){
            throw new FlyException("\n''Я заглох, сейчас надо смазать пропеллер''\n");
        }
        this.messang = this.getName() + " улетел с ним на " + place + ".\n";
        return this.messang;
    }

    void bol(){
        System.out.print("Они сделали такой резкий вираж, что у " +this.getName()+"а" + this.ParamDo + " и засосало под ложечкой ");
    }

    public int hashCode(){
        return super.hashCode()+this.Name.hashCode();
    }

    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode() ? true : false;
    }

    public String toString() {
        return "существо по имени " + this.Name + " создано\n";
    }

}

