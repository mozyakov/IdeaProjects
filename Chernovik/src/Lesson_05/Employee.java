package Lesson_05;

public class Employee { //создан класс
    int id;          //блок с параметрами класса
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1) { //конструктор класса
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    double yvelichenieZarplaty () { //метод увеличения зарплаты вдвое
        salary *= 2;
        return salary;
    }
}  //класс Employee закончился

class EmployeeTest {
    public static void main(String[] args) {
        Employee man1 = new Employee(1, "Ivanov", 30, 300, "IT");
        Employee man2 = new Employee(2, "Sidorov", 27, 500, "Marketing");

        System.out.println("Ivanov zp:" + man1.salary);
        System.out.println("Sidorov zp:" + man2.salary);

        man1.yvelichenieZarplaty();   //повышаем  зарплаты
        man2.yvelichenieZarplaty();

        System.out.println("Ivanov zp:" + man1.salary);
        System.out.println("Sidorov zp:" + man2.salary);
    }
}
