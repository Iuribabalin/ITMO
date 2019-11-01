package com.company;

class Place extends AbstractPlace {
    static String clientsArr;
    
    public Place(String name, Places list) {
        super(name);
        clientsArr = name;
    }
}