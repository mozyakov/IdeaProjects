package Lesson_7_package_access_modifiers;

public class Employee {
    public double salary;

    public void dvoinayaZP() {
        double result = salary *2;
        System.out.println("Теперь зп стала " + result);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
        System.out.println(emp.salary);
    }
}
class  EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
        System.out.println(emp.salary);

    }
}
