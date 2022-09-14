package Zaur.Lesson6_Overloading;

public class Employee {
    int id;          //блок с параметрами класса
    String surname;
    int age;
    double salary;
    String department;
    
    Employee(int id, String surname, int age) { //конструктор с указанием трёх значений
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public Employee (String surname, int age) { //ещё конструктор, но с другими параметрами
        this.surname = surname;
        this.age = age;
    }

    Employee(int id, String surname, int age, double salary, String department) { //конструктор с указанием всех параметров
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }


}

class EmployeeTest {
    public static void main(String[] args) {    // создаем объекты класса с разными параметрами
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.department);
        Employee emp2 = new Employee("Petrov", 20);
        System.out.println(emp2.salary);
        Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
