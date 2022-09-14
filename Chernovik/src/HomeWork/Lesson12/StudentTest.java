package HomeWork.Lesson12;

import Zaur.Lesson11_primitive_and_referense_in_method.*;

public class StudentTest {
    public static void method0(Student ss1, Student ss2) {
        if (ss1.equals(ss2)) { //сравниваем сами объекты
            System.out.println("method0 - ss1 такой же как ss2");
        } else {
            System.out.println("method0 - ss1 НЕ такой же как ss2");
        }
    }

    public static void method1(Student ss1, Student ss2) { //тут сравниваем лишь значения внутри объектов
        if (ss1.name.equals(ss2.name) && ss1.course == ss2.course && ss1.grade == ss2.grade) {
            System.out.println("method1 - ss1 такой же как ss2");
        } else {
            System.out.println("method1 - ss1 НЕ такой же как ss2");
        }
    }

    public static void method2(Student ss1, Student ss2) { //сравниваем лишь значения внутри объектов
        if (ss1.name.equals(ss2.name)) {
            if (ss1.course == ss2.course) {
                if (ss1.grade == ss2.grade) {
                    System.out.println("ss1 == ss2 по всем параметрам");
                } else {
                    System.out.println("ss1 и ss2 те же имена и курсы, но оценки различаются");
                }
            } else {
                System.out.println("ss1 и ss2 одинаковые только имена");
            }
        } else {
            System.out.println("имена ss1, ss2 различаются");
        }
    }

    public static void main(String[] args) {
        Student sor1 = new Student("Ivan", 4, 4.7);
        Student sor2 = new Student("Ivan", 4, 4.7);
        Student sor3 = sor1; //присвоение, один объект просто разные указатели на него
        method0(sor1, sor2);
        method1(sor1, sor2);
        method2(sor1, sor2);
    }
}

