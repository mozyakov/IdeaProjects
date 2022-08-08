package HomeWork.Lesson10.p4;

import HomeWork.Lesson10.p1.A;
import HomeWork.Lesson10.p1.p2.B;
import HomeWork.Lesson10.p1.p2.p3.C;
import HomeWork.Lesson10.p4.p5.*;

import static HomeWork.Lesson10.p1.p2.B.*;

public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        System.out.println(b1);
        System.out.println(b2);
    }
}
