package VideoCourse.Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
        Employee2 e = new Teacher2();
        t.sleep();
        e.sleep();
        System.out.println(t.salary);


    }
}
class Employee2 {
    double salary = 100.0;
    String name = "Kolya";

    public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher2 extends Employee2 {
    double salary = 200.0;
    int countShcoolar;
    @Override
    public Eda eat() { //return type родителя или сабкласс родителя
        System.out.println("Kushaet uchitel");
        Fructs f = new Fructs();
        return f;
    }
    @Override
    public void sleep() {
        System.out.println("Spit uchitel");
    }
}

