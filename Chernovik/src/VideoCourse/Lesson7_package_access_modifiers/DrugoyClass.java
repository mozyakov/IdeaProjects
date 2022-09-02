package VideoCourse.Lesson7_package_access_modifiers;

public class DrugoyClass {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
        System.out.println(emp.salary);
    }
}
