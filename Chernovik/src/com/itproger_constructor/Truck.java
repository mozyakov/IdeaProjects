package com.itproger_constructor;

public class Truck extends Transport{
    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);    //super как this, но сразу ищет у родителя
    };
    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);    //super как this, но сразу ищет у родителя
        this.isLoaded = isLoaded;
    };
    public Truck(double speed, int weight) {
        super(speed, weight);
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public void getLoaded() {
        if(isLoaded == true) {
            System.out.println("грузовик загружен");
        }else {
            System.out.println("грузовик не загружен");
        }
    }


}
