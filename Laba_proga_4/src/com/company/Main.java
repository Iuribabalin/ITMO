/*
Вариант: 411
Карлсон вздохнул. И прежде чем Малыш успел опомниться, Карлсон полетел с ним на балкончик!
Они сделали такой резкий вираж, что у Малыша загудело в ушах и засосало под ложечкой еще
сильнее, чем на "американских горах". Затем все произошло точь-в-точь так, как сказал Карлсон.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        boolean flagName = false;
        boolean flagPlace = false;
        //local class -> Histori
        class Histori{
            private void PrintHistori(){
                System.out.print("My histori: \n");
            }
        }

        Histori histori = new Histori();
        HumanwithPropeller karloson = new HumanwithPropeller("Карлсон");
        Kid kid = new Kid("Малыш", " загудело в ушах");
        Place place = new Place("балкончик", Places.BALCONY);
        Place rollerCoaster = new Place("американские горки", Places.Rollercoaster);

        checked check = new checked();

        //анонимный класс создаёться внутри java машины
        unchecked uncheck = new unchecked(){
            boolean PlaceCheck(String NamePlace) {
                boolean flag = false;
                if (!(!(NamePlace.equals("балкончик")) && !(NamePlace.equals("американские горки")))){
                    flag = true;
                }
                return flag;
            }
        };

        unchecked.InUnchecked inUnchecked = new unchecked.InUnchecked();

        if((check.ourHero(karloson.getName()) == check.ourHero(kid.getName())) && (!karloson.getName().equals(kid.getName())))
            flagName = true;


        if((uncheck.PlaceCheck(place.getName()) == uncheck.PlaceCheck(rollerCoaster.getName())) && (!place.getName().equals(rollerCoaster.getName())))
            flagPlace = true;


        if(flagName && flagPlace){
            System.out.print("Good work \n");
            System.out.print(karloson.toString());
            System.out.print(kid.toString());
            System.out.print(place.toString());
            System.out.print(rollerCoaster.toString());
            kid.Gudok();
            histori.PrintHistori();
            karloson.sighed();
            kid.waked();
            karloson.fly();
            kid.bol();
            rollerCoaster.RCoaster();
            karloson.speak();
        } else if (!flagName){
            System.out.print("Error name persons, pleas update names");
        } else {
            System.out.print("Error name places, pleas update names");
        }

        inUnchecked.PrintInf();


    }
}