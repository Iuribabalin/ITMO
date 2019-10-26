package com.company;

import java.util.ArrayList;

abstract class Human implements IHuman {
    private ArrayList<Human> clientsArr = new ArrayList<Human>();
    private String Name;

    Human(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }

    void speak(){
        System.out.print("Затем все произошло точь-в-точь так, как сказал "+this.getName());
    }

    void sighed() {
        System.out.print(this.getName() + " вздохнул" + "\n");
    }

    void waked(){
        System.out.print("Прежде чем " + this.getName() + " успел опомнился" + ", ");
    }

    void fly(){
        System.out.print(this.getName() + " улетел с ним на " + place1.clientsArr + "\n");
    }

    void dodo(){
        System.out.print(this.getName() + " сделали такой резкий вираж ");
    }

    void bol(){
        System.out.print("что у " +this.getName() + " загудело в ушах и засосало под ложечкой ");
    }

    public int hashCode(){
        return super.hashCode()+this.Name.hashCode();
    }

    public boolean equals(Object obj) {
        return obj.hashCode()== this.hashCode() ? true : false;
    }

    public String toString() {
        return "существо по имени " + this.Name + " создано\n";
    }

}
