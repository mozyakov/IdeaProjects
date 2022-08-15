package com.itproger_constructor;
public class Transport {
    private double speed;
    private int weight;
    private String color = "red";  //можно указать дефолтные значения
    private byte[] coordinate = {0, 0, 0};


    Transport (double speed, int weight) {
        this.speed = speed;
        this.weight = weight;
        System.out.println("object created");
        //System.out.println(getValues());
    }
    Transport (int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println("object created");
        //System.out.println(getValues());
    }
    Transport (double speed, int weight, String color) {
        System.out.println("object created");
        System.out.println(getValues());

    }
    Transport (double speed, int weight, String color, byte[] coordinate) {
    System.out.println("object created");
    setValues(speed, weight, color, coordinate);
    System.out.println(getValues());
    }

    public void setValues(double speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = ("obj.speed: " + speed + "   obj.weight: " + weight + "   obj.color: " + color +"\n");
        String infoCoordinates = "Coordinates: ";

        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + ", ";
        }
        return info + infoCoordinates;
    }

}
