package Lesson10_import_omport_static;
 import Lesson9_variable_vision.*; //импорт всех классов из пакета
//import Lesson9_variable_vision.Car;   //импорт пакета и его класса
//import Lesson9_variable_vision.Student;
public class A {
    public static void main(String[] args) {
        Lesson9_variable_vision.Car c1 = new Lesson9_variable_vision.Car("red", "V6");
        Car c2 = new Car("blue", "V8"); // благодаря импорту кода меньше чем в строчке выше
        Student s1 = new Student();

    }
}
