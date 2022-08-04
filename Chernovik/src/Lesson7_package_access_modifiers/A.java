package Lesson7_package_access_modifiers;

public class A {
    public static void main(String[] args) {
        B object = new B();
        Lesson6_Overloading.Employee emp = new Lesson6_Overloading.Employee("Ivanov", 21); // объект класса из другого пакета
    }
}
