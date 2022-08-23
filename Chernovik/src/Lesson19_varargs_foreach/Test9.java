package Lesson19_varargs_foreach;
import java.util.Arrays;
public class Test9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        for(int i = 0; i < array1.length && i < array2.length; i++) {
            array1[i] = 10;   //все элементы станут 10
            array2[i] = 20;   //все элементы станут 20
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));














    }
}
