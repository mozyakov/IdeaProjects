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

    public void setValues(double speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        System.out.println("Наш второй метод");
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {isLoaded = loaded;}
    public String getLoaded() {
        if(isLoaded == true) {
            return "грузовик загружен";
        }else {
            return "грузовик не загружен";
        }
    }


}
