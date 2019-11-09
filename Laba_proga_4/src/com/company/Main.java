/*
Вариант: 411
Карлсон вздохнул. И прежде чем Малыш успел опомниться, Карлсон полетел с ним на балкончик!
Они сделали такой резкий вираж, что у Малыша загудело в ушах и засосало под ложечкой еще
сильнее, чем на "американских горах". Затем все произошло точь-в-точь так, как сказал Карлсон.
 */

package com.company;

public class Main {
    public static void main(String[] args){
        String Massenge = null;
        boolean flagerror = false;
        boolean flagcnt = false;


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

            while (!flagerror) {
                try {
                    Massenge = karloson.fly(place.getName());
                    if(flagcnt) {
                        System.out.print("\nНаконец то, ну всё полетели вииииии\n");
                    }
                    System.out.print(Massenge);
                    flagerror = true;
                    flagcnt = true;
                } catch (FlyException e) {
                    flagcnt = true;
                    System.out.print(e.getMessage());
                }
            }

            kid.bol();
            rollerCoaster.RCoaster();
            karloson.speak();
            invest.PrintInf();
        }catch (NamePlaceException e){
            System.out.print(e.getMessage());
        }
    }
}