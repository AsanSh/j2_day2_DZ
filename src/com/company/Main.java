package com.company;

public class Main {
/*
2)  (Дэдлайн 19.09.2020 23:59) :
a)  Доделать все пункты практического задания из презентации.
b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
c)  Создать Интерфейс Printable с методом void print();
d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.

e)  В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания
свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
Например если в параметре передается “2й” метод должен создать объект именно этого типа.
f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();
 */

    public static void main(String[] args) {


        Transport[] transport = {new Car(2012, "diesel", "BMW", "4WD", 4000),
                new Bike(2020, "Manual", "Dart", "Gornyi", 2),
                new Train(1788, "coal", "Paasnger", 21, "Lux"),
                new Plane(1965, "airDiesel", "Boeng", 1000, 265)};

        for (int i = 0; i < transport.length; i++) {
            System.out.println(transport[i].getClass().getSimpleName() + transport[i].print());
        }
    }

    public static String createObject(String className) {

        if (className.equals(Car.class)) {
            System.out.println(new Car(2012, "diesel", "BMW", "4WD", 4000));
        } else {
            if (className.equals(Bike.class)) {
                System.out.println(new Bike(2020, "Manual", "Dart", "Gornyi", 2));
            } else if (className.equals(Train.class)) {
                System.out.println(new Train(1788, "coal", "Paasnger", 21, "Lux"));
            }
        }
        return "ne znau НЕ ПОНИМАЮ";
    }
}

