package com.company;

class Place extends AbstractPlace {
    static String placeArr;

    public Place(String name, Places list) {
        super(name);
        placeArr = name;
    }
}