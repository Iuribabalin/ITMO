package com.company;

import java.util.ArrayList;

abstract class Place implements IPlace{
    private ArrayList<Place> clientsArr = new ArrayList<Place>();
    private String NamePlace;
    private Places type;

    Place(String name) {
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

    public int hashCode(){
        return super.hashCode()+this.NamePlace.hashCode();
    }

    public boolean equals(Object obj) {
        return obj.hashCode()== this.hashCode() ? true : false;
    }

    public String toString() {
        return "место " + this.NamePlace + " создано\n";
    }
}
