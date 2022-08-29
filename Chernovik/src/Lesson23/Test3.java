package Lesson23;
public  class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.eat();
        Teacher1 t = new Teacher1();
        t.eat();

    }
}
class Eda{}
class Fructs extends Eda{};
class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int exprerience;

    int eat() { //какой тип данных в методе родителя
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return 5;
    }
    void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher1 extends Employee1 {
    int countShcoolar;
    @Override
    int eat() { //такой же тип данных в методе ребенка
        System.out.println("Kushaet uchitel");
        Fructs f = new Fructs();
        return 6;
    }
    @Override
    void sleep() {
        System.out.println("Spit uchitel");
    }

}