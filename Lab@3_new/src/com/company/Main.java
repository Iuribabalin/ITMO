/*
Вариант: 411
Карлсон вздохнул. И прежде чем Малыш успел опомниться, Карлсон полетел с ним на балкончик!
Они сделали такой резкий вираж, что у Малыша загудело в ушах и засосало под ложечкой еще
сильнее, чем на "американских горах". Затем все произошло точь-в-точь так, как сказал Карлсон.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        HumanwithPropeller karloson = new HumanwithPropeller("Карлсон");
        System.out.print(karloson.toString());
        Kid kid = new Kid("Малыш", " загудело в ушах");
        System.out.print(kid.toString());
        Place place = new Place("балкончик", Places.BALCONY);
        System.out.print(place.toString());
        Place rollerCoaster = new Place("американские горки", Places.Rollercoaster);
        System.out.print(rollerCoaster.toString());
        kid.Gudok();
        System.out.print("Рассказ: \n");
        karloson.sighed();
        kid.waked();
        karloson.fly();
        kid.bol();
        rollerCoaster.RCoaster();
        karloson.speak();
    }
}















//дока ecvals