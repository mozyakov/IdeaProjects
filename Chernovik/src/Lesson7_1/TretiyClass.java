package Lesson7_1;

import Lesson7_package_access_modifiers.Employee;

public class TretiyClass {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
        System.out.println(emp.salary);
    }
}
