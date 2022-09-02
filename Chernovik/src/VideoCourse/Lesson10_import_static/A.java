package VideoCourse.Lesson10_import_static;
//import VideoCourse.Lesson9_variable_vision.*; //импорт всех non static классов и элементов
import static VideoCourse.Lesson9_variable_vision.Car.*;    //импорт всех static элементов класса
import static VideoCourse.Lesson9_variable_vision.Student.*;
//import static VideoCourse.Lesson9_variable_vision.Car.ab; //импорт конкретной static только так


import VideoCourse.Lesson9_variable_vision.*; //импорт всех классов пакета
//import VideoCourse.Lesson9_variable_vision.Student; //импорт конкретного класса


public class A {
    public static void main(String[] args) {
        VideoCourse.Lesson9_variable_vision.Car c1 = new VideoCourse.Lesson9_variable_vision.Car("red", "V6");
        Car c2 = new Car("blue", "V8"); // благодаря импорту кода меньше чем в строчке выше
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c); //static переменная принадлежит классу, поэтому его имя
        System.out.println(ab); //вывод static переменной
        System.out.println(count);
        System.out.println(f);

    }
}
