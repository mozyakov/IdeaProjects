package Zaur.Lesson19_varargs_foreach;
import java.util.Arrays;
public class Test4_foreach_2_loop_foreach {
    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for(int a: array) {
            summa += a;
        }
        System.out.println(summa); //сумма элементов массива
        System.out.println(Arrays.toString(array)); //массив остался прежним


    }
}
