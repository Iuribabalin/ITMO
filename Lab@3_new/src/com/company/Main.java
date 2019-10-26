/*
Вариант: 411
Карлсон вздохнул. И прежде чем Малыш успел опомниться, Карлсон полетел с ним на балкончик!
Они сделали такой резкий вираж, что у Малыша загудело в ушах и засосало под ложечкой еще
сильнее, чем на "американских горах". Затем все произошло точь-в-точь так, как сказал Карлсон.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Karloson karloson = new Karloson("Карлсон");
        System.out.print(karloson.toString());
        Kid kid = new Kid("Малыш");
        System.out.print(kid.toString());
        place1 place = new place1("балкончик");
        System.out.print(place.toString());
        They they = new They("Они");
        RollerCoaster rollerCoaster = new RollerCoaster("американских горках");
        System.out.print(rollerCoaster.toString());
        System.out.print("Рассказ: \n");
        karloson.sighed();
        kid.waked();
        karloson.fly();
        they.dodo();
        kid.bol();
        rollerCoaster.RCoaster();
        karloson.speak();
    }
}
