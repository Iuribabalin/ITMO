package com.company;

class Kid extends Human {

    Kid(String name, String g) {
        super(name, g);
    }
    void GOOOO(){
        System.out.print("Функция гудеть в ушах добавлена для " + getName() + "\n");
    }

}
