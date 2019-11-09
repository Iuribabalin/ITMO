/*
Вариант: 411
Карлсон вздохнул. И прежде чем Малыш успел опомниться, Карлсон полетел с ним на балкончик!
Они сделали такой резкий вираж, что у Малыша загудело в ушах и засосало под ложечкой еще
сильнее, чем на "американских горах". Затем все произошло точь-в-точь так, как сказал Карлсон.
 */

package com.company;

public class Main {
    public static void main(String[] args) {
        String Massenge = null;

        //local class -> Histori
        class Histori{
            private void PrintHistori(){
                System.out.print("My histori: \n");
            }
        }

        Histori histori = new Histori();
        HumanwithPropeller karloson = new HumanwithPropeller("Карлсон"){
            public void sighed(){
                System.out.print(this.getName() + " вздохнул" + "\n");
                System.out.print("Пора валить \n");
            }
        };

        Kid kid = new Kid("Малыш", " загудело в ушах");
        Place place = new Place("балкончик", Places.BALCONY);
        Place rollerCoaster = new Place("американские горки", Places.Rollercoaster);
        EndHistori.InEndHistori invest = new EndHistori.InEndHistori();
//"балкончик"

        try {
            System.out.print(karloson.toString());
            System.out.print(kid.toString());

            Massenge = place.NamePlace();
            System.out.print(Massenge);
            Massenge = rollerCoaster.NamePlace();
            System.out.print(Massenge);

            kid.Gudok();
            histori.PrintHistori();
            karloson.sighed();
            kid.waked();

            try {
                Massenge = karloson.fly(place.getName());
                System.out.print(Massenge);
            }
            catch (FlyException e){
                System.out.print(e.getMessage());
                System.out.print(karloson.getName() + " улетел с ним на " + place.getName() + ".\n");
            }

            kid.bol();
            rollerCoaster.RCoaster();
            karloson.speak();
        }
        catch (NamePlaceException e){
            System.out.print(e.getMessage());
        }

        invest.PrintInf();

    }
}