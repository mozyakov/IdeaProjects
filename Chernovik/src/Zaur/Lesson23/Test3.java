package Zaur.Lesson23;
public  class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Teacher1();
        e.eat(); //будет кушает учитель, потому что объект создали в тичере

    }
}
class Eda{}
class Fructs extends Eda{}
class Jidkost{}
class Water extends Jidkost{}
class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int exprerience;
    Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher1 extends Employee1 {
    int countShcoolar;
    @Override
    Eda eat() { //return type родителя или сабкласс родителя
        System.out.println("Kushaet uchitel");
        Fructs f = new Fructs();
        return f;
    }
}
class A{
    Employee1 objectCreation() {
        return new Employee1();
    }
}
class B extends A{
    @Override
    Teacher1 objectCreation() {
        System.out.println("ok");
        return new Teacher1();
    }
};
