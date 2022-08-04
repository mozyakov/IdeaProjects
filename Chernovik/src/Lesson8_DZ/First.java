package Lesson8_DZ;

public class First {
    static int tripleMultiply(int a, int b, int c) {
        return a*b*c;
    }

    static void divide(int a, int b) {
        System.out.println("Целое частное от деления "+a+" / "+b+" = "+ a/b +"; Остаток "+ a%b);
    }
}

class Second {
    public static void main(String[] args) {
        System.out.println("Применяем метод тройного умножения:  = " + First.tripleMultiply(10, 3, 7));
        System.out.println("Применяем метод тройного умножения:  = " + First.tripleMultiply(5, 2, 3));
        System.out.println();
        First.divide(10, 3);
        First.divide(20, 6);


    }
}
