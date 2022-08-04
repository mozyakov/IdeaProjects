package Lesson_7_HomeWork;

public class Employee {
    int id;          //блок с параметрами класса
    public String surname;
    int age;
    private double salary;
    String department;

    public void pokazId() {
        System.out.println("Показ default id через метод =" + id); //у метода  public access modifier = работает везде
    }

    public void pokazSurname() {
        System.out.println("Показ public surname через метод =" + surname); //у метода public access modifier = работает везде
    }

    public void pokazSalary() {
        System.out.println("Показ private salary через метод =" + salary); //у метода public access modifier = работает везде
    }

    public Employee(int id) { // конструктор c public access modifier
        this.id = id;
    }

    Employee(String surname) { //конструктор c default access modifier
        this.surname = surname;
    }

    private Employee(double salary) { //конструктор c private access modifier
        this.salary = salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {    // создаем объекты класса с разными параметрами
        Employee emp1 = new Employee(1);
        System.out.println(emp1.id);
        emp1.pokazId();
        emp1.pokazSurname();
        emp1.pokazSalary();
        Employee emp2 = new Employee( 20);
        System.out.println(emp2.surname);
        emp2.pokazId();
        emp2.pokazSurname();
        emp2.pokazSalary();
        //Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT"); // не сработает, у конструктора private access modifier
        //System.out.println(emp3.department);
    }
}
