package HomeWork.Lesson12;

import Lesson11_primitive_and_referense_in_method.*;

public class StudentTest {

    void method1(Student ss1, Student ss2) {
        if (ss1.name.equals(ss2.name) && ss1.course == ss2.course && ss1.grade == ss2.grade) {
            System.out.println("ss1 такой же как ss2");
        } else {
            System.out.println("ss1 НЕ такой же как ss2");
        }
    }

    void method2(Student ss1, Student ss2) {
        if (ss1.name.equals(ss2.name)) {
            if (ss1.course == ss2.course) {
                if (ss1.grade == ss2.grade) {
                    System.out.println("ss1 == ss2 по всем параметрам");
                } else {
                    System.out.println("ss1 и ss2 такие же имена и курсы, но оценки различаются");
                }
            } else {
                System.out.println("ss1 и ss2 одинаковые только имена");
            }
        } else {
            System.out.println("между ss1 and ss2 нет ничего общего");
        }
    }
}

