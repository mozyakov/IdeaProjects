package HomeWork.Lesson9;

public class Test2 {
    int a = 1;
    static int b = 2; //принадлежит всему классу, можно использовать без объекта! Test2.b  !!!

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }

}
