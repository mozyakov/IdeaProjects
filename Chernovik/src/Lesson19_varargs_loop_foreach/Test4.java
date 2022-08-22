package Lesson19_varargs_loop_foreach;

public class Test4 {
    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for(int a: array) {
            summa += a;
        }
        System.out.println(summa); //сумма элементов массива

    }

}
