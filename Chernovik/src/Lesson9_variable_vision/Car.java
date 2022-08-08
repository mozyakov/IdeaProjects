package Lesson9_variable_vision;

public class Car {
    String color; //это instance переменные (object переменные), видны везде в своём объекте
    String engine;
    static  int count; //это static переменная, видна везде в своем классе

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }


    void changeColor(String color) { //color это параметр, виден в своём методе
        System.out.println("Цвет машины изменился на");
        this.color = color;
        int price = 5000; //local variable, видна только внутри метода с момента своего объявления
        price += 1000;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
        System.out.println(c.getColor());


    }
}
