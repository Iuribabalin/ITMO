package com.company;

abstract class AbstractPlace implements IPlace{
    private final String NamePlace;
    private Places type;
    private String messang = null;

    AbstractPlace(String name) {
        NamePlace = name;
    }

    public String getName(){
        return NamePlace;
    }

     void setType(Places type){
        this.type = type;
    }

    public Places getType(Places rollercoaster) {
        return type;
    }

    void RCoaster(){
        System.out.print("еще сильнее, чем на " + this.getName() + "\n");
    }

    String NamePlace(){
        this.messang = "место " + this.NamePlace + " создано\n";
        return this.messang;
    }

    public int hashCode(){
        return super.hashCode()+this.NamePlace.hashCode();
    }

    public boolean equals(Object obj) {
        return obj.hashCode()== this.hashCode() ? true : false;
    }
}
