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
    /*public static void changeDoors(Car car) { //меняю кол-во дверей внутри метода, но условия задачи другие
        car.countDoors += 2;                    //по условиям надо менять через параметры метода
    }*/
    static void changeCountDoors(Car car, int countDoors) { //изменение кол-во дверей в параметрах метода
        car.countDoors = countDoors;
    }
    static void changeColor(Car car1, Car car2) { //изменение цвета между двумя объектами
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
    public static void main(String[] args) {
        Car lada = new Car("white", "V4", 2);
        Car volga = new Car("black", "V4", 4);
        System.out.println("Лада цвет:" + lada.color + " кол-во дверей:"  + lada.countDoors);
        System.out.println("Волга цвет:" + volga.color + " кол-во дверей:"  + volga.countDoors);
        System.out.println("=====ниже изменения=====");

        changeCountDoors(lada, 4); //меняю кол-во дверей
        changeColor(lada, volga);  //меняю цвета машин между собой

        System.out.println("Лада цвет:" + lada.color + " кол-во дверей:"  + lada.countDoors);
        System.out.println("Волга цвет:" + volga.color);
        System.out.println("========================");


        Car c1 = new Car("red", "V4", 2);
        Car c2 = new Car("red", "V4", 2);
        Car c3 = c2;
        System.out.println(c1 == c2);       //false птмчто это два РАЗНЫХ объекта просто с = значениями
        System.out.println(c1.equals(c2));  //falce
        System.out.println(c1.color == c2.color);      //true птмчто мы = их одинаковые значения
        System.out.println(c1.color.equals(c2.color)); //true
        System.out.println("========================");
        System.out.println(c2 == c3);       //true
        System.out.println(c2.equals(c3));  //true
    }
}