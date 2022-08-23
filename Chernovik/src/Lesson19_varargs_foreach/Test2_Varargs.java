package Lesson19_varargs_foreach;

public class Test2_Varargs {
    static void summa(int a, int b) {
        System.out.println(a + b);
    }
    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    //чтобы не писать множество методов с разными кол-вом аргументов
    //можно написать так, в том числе с разными типами данных
    static void summa(int ... a) {
        int summa = 0;
        for(int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }
    static void summaS(String s, int ... a) { //с разными типами данных в параметрах
        int summa = 0;
        for(int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println("s " + summa);
    }

    public static void main(String[] args) {
        summa();                          //0
        summa(6, 3);              //9
        summa(6, 3, 1);       //10
        summa(6,3,1,4);   //14
        summaS("str", 6,3,1,4);   //s 14

    }

}
