package Zaur.Lesson22_p1;
import Zaur.Lesson22_incapsulation_nasledovanie.*;
public class Student extends Human {
    public static void main(String[] args) {
            Student s = new Student();
            System.out.println(s.name);
            System.out.println(Student.salary);
            s.work();
            s.rest();

    }
}