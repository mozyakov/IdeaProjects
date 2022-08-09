package HomeWork.Lesson10.p4;

//import HomeWork.Lesson10.p1.A; //импорт конкретного класса
import HomeWork.Lesson10.p1.*;  //импорт сразу всех классов из пакета p1
import HomeWork.Lesson10.p1.p2.*;
import HomeWork.Lesson10.p1.p2.p3.*;
import HomeWork.Lesson10.p4.p5.*;

import static HomeWork.Lesson10.p1.p2.B.*;

public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str); //к объекту класса цепляем переменную из этого класса

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        F f2 = new F();
        System.out.println(f2.f1);
        f2.outPutFvoid();
        f2.outputFnotvoid();


        System.out.println(b1);
        System.out.println(b2);
    }
}
