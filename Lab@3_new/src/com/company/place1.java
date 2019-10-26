package com.company;

class place1 extends Place {
    static String clientsArr;

    place1(String name) {
        super(name);
        this.setType(Places.Balcony);
        clientsArr = name;
    }
}
