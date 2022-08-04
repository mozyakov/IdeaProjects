package Lesson8_DZ;

public class First {
    static int tripleMultiply(int a, int b, int c) {
        int result = a*b*c;
        return result;
    }

    static void divide(int a, int b) {
        System.out.println("Частное от деления " +a+ " на " +b+ " = " + a/b);
        System.out.println("Остаток от деления " +a+ " на " +b+ " = " + a%b);
    }
}

class Second {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 7;
        System.out.println("Применяем метод тройного умножения: "+a+" * "+b+" * "+c+" = " + First.tripleMultiply(a, b, c));
        System.out.println("Применяем метод тройного умножения: 5 * 2 * 3 = " + First.tripleMultiply(5, 2, 3));
        System.out.println();
        First.divide(10, 3);
        System.out.println();
        First.divide(20, 6);


    }
}
