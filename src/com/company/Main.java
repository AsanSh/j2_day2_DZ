package com.company;

public class Main {

    private String className;

    public static void main(String[] args) {


        Transport[] transport = {new Car(2012, "diesel", "BMW", "4WD", 4000),
                                 new Bike(2020, "Manual", "Dart", "Gornyi", 2),
                                 new Train(1788, "coal", "Paasnger", 21, "Lux"),
                                 new Plane(1965, "airDiesel", "Boeng", 1000, 265)};

    public String createObject(Car){
        for (int i = 0; i < transport.length; i++) {
            if(i = Car) {
                new Car(2012, "diesel", "BMW", "4WD", 4000);
            } else if (i = Bike) {
                new Bike(2020, "Manual", "Dart", "Gornyi", 2);
            }
        }}

     //switch (Car){
        // case 1: System.out.println("вы хотите создать объект Car");
         //    new Car(2012, "diesel", "BMW", "4WD", 4000);
   //  }


    }
}
