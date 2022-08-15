package com.itproger_constructor;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(250.5, 2500, "red", new byte[]{0, 0, 0});
        System.out.println();
        System.out.println();
        Truck truck = new Truck(12_000, new byte[]{100, 0, 0});
        //truck.setLoaded(true);
        truck.getLoaded();
        truck.setLoaded(true);   //загружаем грузовик
        truck.getLoaded();     //проверяем ещё раз
        //bmw.speed = 250.5; //без конструктора приходится всё выписывать отдельно
        //bmw.weight = 2500; //или использовать метод setValues
        //bmw.color = "red";
        //bmw.coordinate = new byte[]{0, 0, 0};

        //bmw.setValues(250.5, 2500, "red", new byte[]{0, 0, 0});


        //System.out.println(bmw.getValues());
    }
}
