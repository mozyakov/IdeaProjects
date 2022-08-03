package Lesson_6_Overloading;

public class Summirovanie {

    int sum () {
        int result = 0;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }
    int sum (int a){
        int result = a;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int sum (int a, int b) {
        int result = a + b;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int sum (int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }

    int sum ( int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("Сумма всех чисел = " + result);
        return result;
    }
}
class SummirovanieTest {
    public static void main(String[] args) {
        Summirovanie s = new Summirovanie();
        s.sum();
        s.sum(2);
        s.sum(2 + 3);
        s.sum(2 + 3 + 4);
        s.sum(2 + 3 + 4 + 5);

    }
}

