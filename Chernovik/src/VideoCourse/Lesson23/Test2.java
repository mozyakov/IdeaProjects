package VideoCourse.Lesson23;

public class Test2 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor(); //родитель может создать новый объект в классе ребенка
        Employee emp2 = new Teacher(); //перем. супер класса может ссылаться на любой объект подкласса
        Employee emp3 = new Driver();

        Doctor d2 = new Xirurg(); //доктор родитель класса хирург
        Employee emp4 = new Xirurg();  //а значит employee прародитель хирурга



    }
}
class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat() {System.out.println("Eat");}
    void sleep() {System.out.println("Sleep");}
}
class Doctor extends Employee {
    void lechit() {System.out.println("Lechit");}
}

class Xirurg extends Doctor {
    String scalpel;
    void operate() {System.out.println("Operate");}
}

class Teacher extends Employee {
    int countSchoolars;
    void teach() {System.out.println("Teach");}
}

class Driver extends Employee {
    String nameMachine;
    void drive() {System.out.println("Drive");}
}