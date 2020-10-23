package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(createObject("car").print());
        System.out.println("------------------------------------");
        System.out.println(createObject("bike").print());
        System.out.println("------------------------------------");
        System.out.println(createObject("train").print());
        System.out.println("------------------------------------");
        System.out.println(createObject("plane").print());
        System.out.println("------------------------------------");
    }

    public static Printable createObject(String className) {
        Printable printable = null; // спросил у ребят именное ушу строканы
        if ("car".equals(className)) {
            printable = new Car(2012, "diesel", "BMW", "4WD", 4000);
        } else if ("bike".equals(className)) {
            printable = new Bike(2020, "Manual", "Dart", "Gornyi", 2);
        } else if ("train".equals(className)) {
            printable = new Train(1788, "coal", "Paasnger", 21, "Lux");
        } else if ("plane".equals(className)) {
            printable = new Plane(1965, "airDiesel", "Boeng", 1000, 265);
        }
        return printable;

    }
}


/*
ПРИ ИСПОЛЬЗОВАНИИ СВИТЧ У МЕНЯ ВЫХОДИТ ОШИБКА "REQUIRED INT" деп, ХОТЯ ТУУРАЛЕ

  public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "car":
                printable = new Car( 2012, "diesel", "BMW", "4WD", 4000);
                break;
            case "bike":
                printable = new Bike(2020, "Manual", "Dart", "Gornyi", 2);
                break;
            case "train":
                printable = new Train(1788, "coal", "Paasnger", 21, "Lux");
                break;
            case "plane":
                printable = new Plane(1965, "airDiesel", "Boeng", 1000, 265);
                break;
            default:

        } return printable;

    }
*/
