package com.company;

class Kid extends Human {

    Kid(String name, String Do) {
        super(name, Do);
    }
    void Gudok(){
        System.out.print("Функция гудеть в ушах добавлена для " + getName() + "\n");
    }

}
