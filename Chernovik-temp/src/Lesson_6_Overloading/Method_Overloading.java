package Lesson_6_Overloading;

public class Method_Overloading { //overloading позволяет называть похожие методы одним именем
    void show(int i1) {           //какой именно метод использовать будет решать то, что указано в параметрах
        System.out.println(i1);   //по аналогии с конструторами класса
        System.out.println("Data type is Int");
    }
    void show(int a, int b) {    //какой именно метод использовать будет решать то, что указано в параметрах
        System.out.println(a);   //по аналогии с конструторами класса
        System.out.println("Data type is Int");
    }
    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }
    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");
    }
    void show(String s, int a) {
        System.out.println("String:" + s + " int:" + a);
    }
    void show(int a, String s) {
        System.out.println("Какой хороший день!");
    }

}

class Method_OverloadingTest {
    public static void main(String[] args) {
        Method_Overloading mO = new Method_Overloading();
        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Privet!!!";
        mO.show(s);
        mO.show("Privet", 10);

    }
}
