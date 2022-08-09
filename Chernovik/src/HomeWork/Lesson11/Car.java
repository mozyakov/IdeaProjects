package HomeWork.Lesson11;
public class Car {
    String color; String engine; int countDoors;
    Car() {};

    Car(String color, String engine, int countDoors) {
        this.color = color; this.engine = engine; this.countDoors = countDoors;
    }
}
class CarTest{
    public static void changeDoors(Car car) { //меняю кол-во дверей
        car.countDoors += 2;
    }
    public static void changeColor(Car car1, Car car2) { //меняю цвет у объектов
        //car3 = car1.color;
        Car car3 = new Car();
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
    }
    public static void main(String[] args) {
        Car lada = new Car("white", "V4", 2);
        Car volga = new Car("black", "V4", 4);
        System.out.println("lada color : " + lada.color);
        System.out.println("lada countDoors : "  + lada.countDoors);
        System.out.println("volga color : " + volga.color);
        System.out.println("volga countDoors : "  + volga.countDoors);
        System.out.println("=====ниже изменения=====");
        changeDoors(lada);
        changeColor(lada, volga);
        System.out.println("lada color : "  + lada.color);
        System.out.println("lada countDoors : "  + lada.countDoors);
        System.out.println("volga color : "  + volga.color);
        System.out.println("volga countDoors : "  + volga.countDoors);
    }
}