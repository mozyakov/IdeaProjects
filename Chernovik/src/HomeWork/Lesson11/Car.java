package HomeWork.Lesson11;
public class Car {
    String color;
    String engine;
    int countDoors;
    public Car(String color, String engine, int countDoors) {
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }
    /*public void changeDoors(int countDoors) { //но задание сделать этот метод внутри CarTest
      this.countDoors = countDoors;
    } */
}
class CarTest{
    //public static void changeDoors(Car car) { //меняю кол-во дверей но условия задачи другие
        //car.countDoors += 2;
    //}
    static void changeCountDoors(Car c, int countDoors) {
        c.countDoors = countDoors;
    }
    static void changeColor(Car car1, Car car2) { //меняю цвет у объектов
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
    public static void main(String[] args) {
        Car lada = new Car("white", "V4", 2);
        Car volga = new Car("black", "V4", 4);
        System.out.println("lada color : " + lada.color);
        System.out.println("lada countDoors : "  + lada.countDoors);
        System.out.println("volga color : " + volga.color);
        System.out.println("volga countDoors : "  + volga.countDoors);
        System.out.println("=====ниже изменения=====");

        changeCountDoors(lada, 4); //меняю кол-во дверей
        changeColor(lada, volga);  //меняю цвета машин между собой
        System.out.println("lada color : "  + lada.color);
        System.out.println("lada countDoors : "  + lada.countDoors);
        System.out.println("volga color : "  + volga.color);
        System.out.println("volga countDoors : "  + volga.countDoors);
    }
}