package VideoCourse.Lesson8_final_static;

public class Car {
    String color = "blue";
    String engine = "V6";

}

class Human {
    String name = "Ivan";
    final Car c = new Car(); //final запрещает изменение объекта класса Car, но позволяет менять атрибуты объекта цвет и мотор

    public static void main(String[] args) {
        Human h1 = new Human();
        //h1.c = new Car(); //запрещено изменение
        //h1.c = new Car();
        h1.c.engine = "V8"; //разрешено менять внутренние свойства (параметры)
        h1.c.color = "red";
    }
}
