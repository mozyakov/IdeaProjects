package VideoCourse.Lesson8_final_static;

public class Test1 {
    public final int a; //final это навсегда, нельзя изменить инстанс переменную
    //поэтому константу static нужно определять(указывать значение) при создании

    Test1() {   //можно использовать инстанс переменную только с помощью уже созданного объекта
        a = 10;  //через конструктор
    }

    Test1(boolean b) {
        a = 15;  // в разных конструкторах разные значения а
    }

    public void abc(short s) {
        final byte b; //это локал переменная, видна только внутри данного метода
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a = t.a*2; // переменная а = final, поэтому её нельзя изменить
        System.out.println(t.a);

    }
}
