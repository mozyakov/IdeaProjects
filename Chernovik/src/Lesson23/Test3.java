package Lesson23;

import java.sql.SQLOutput;

public class Test3 {
}
class Eda{}
class Fruct extends Eda{}


class Employee1{
    double salary = 100;
    String name;
    int age;
    int experience;

    Eda eat() {
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    void sleep() {System.out.println("Sleep");}

}
class Teacher1 extends Employee1 {
    int countSchoolars;
    @Override
    Fruct eat() {
        System.out.println("Кушает учитель");
        Fruct f = new Fruct();
        return f;
    }
    void teach() {System.out.println("Teach");}
}