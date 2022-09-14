package Zaur.Lesson22_incapsulation_nasledovanie;
public class Test3 {
    void upSalary(Employee e) {
        e.salary *= 1.1;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();
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
class Doctor extends Employee{
    void lechit() {System.out.println("Lechit");}
}
class Xirurg extends Doctor{
    String scalpel;
    void operate() {System.out.println("Operate");}
}
class Dantist extends Doctor{

}

class Teacher extends Employee {
    int countSchoolars;
    void teach() {System.out.println("Teach");}
}

class Driver extends Employee {
    String nameMachine;
    void drive() {System.out.println("Drive");}
}