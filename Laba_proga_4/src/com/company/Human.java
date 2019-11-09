package com.company;

abstract class Human implements IHuman {
    private final String Name;
    private String ParamDo ;

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

