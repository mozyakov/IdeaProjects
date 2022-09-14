package Zaur.Lesson22_incapsulation_nasledovanie;

public class Human {

    protected String name = "Kolya";
    protected String getName() {return name;}
    protected void setName(String n) {name = n;}
    protected static int salary = 150;
    protected void work() {System.out.println("Work");}
    protected static void rest() {System.out.println("Rest");}
}

class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        s.rest();
    }
}