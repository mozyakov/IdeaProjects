package com.itproger_constructor;

public class Car extends  Transport{
    Car (double speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);   //super как this, но сразу ищет у родителя
        System.out.println("object created");;
    }
}
