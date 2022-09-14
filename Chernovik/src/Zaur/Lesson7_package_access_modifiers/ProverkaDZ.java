package Zaur.Lesson7_package_access_modifiers;

import HomeWork.Lesson7.Employee;

public class ProverkaDZ {
    public static void main(String[] args) {
        Employee emp1 = new Employee(01);
        //Lesson_7_HomeWork.Employee emp2 = new Lesson_7_HomeWork.Employee("Vtorov", 33);
        // не сработает, потому что у конструктора default access modifier работает только в родном пакете

        //Lesson_7_HomeWork.Employee emp3 = new Lesson_7_HomeWork.Employee(03, "tretiev", 30; 3300, "Marketing");
        //третий конструктор невозможен, он private acces //работает только внутри родного класса

        //System.out.println("Показ ИД через принт " + emp1.id);
        // не сработает, у переменной "id"  default access modifier работает только в родном пакете
        emp1.pokazId(); //у метода public access modifier = работает везде

        System.out.println("Показ surname через принт " + emp1.surname); // у переменной public access modifier работает везде
        emp1.pokazSurname(); //у метода public access modifier = работает везде

        //System.out.println("Показ salary через принт" + emp1.salary); //не сработает, у переменной "salary" private access
        emp1.pokazSalary(); //у метода public access modifier = работает везде

    }
}
