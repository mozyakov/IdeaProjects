package Lesson_6_Overloading;

public class Employee {
    int id;          //блок с параметрами класса
    String surname;
    int age;
    double salary;
    String department;
    
    Employee(int id2, String surname2, int age2) { //конструктор с тремя значениями по умолчанию
        this(id2, surname2, age2, 0.0, null);
    }

    Employee (String surname3, int age3) { //ещё конструктор но с другими параметрами
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) { //ещё конструктор
        int id = id4;
        String surname = surname4;
        int age = age4;
        double salary = salary4;
        String department = department4;
    }


}

class EmployeeTest {
    public static void main(String[] args) {    // создаем объекты класса с разными параметрами
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 20);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
