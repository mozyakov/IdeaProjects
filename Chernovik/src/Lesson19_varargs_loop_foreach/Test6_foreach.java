package Lesson19_varargs_loop_foreach;
import java.util.Arrays;

public class Test6_foreach {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("=========================");

        for(int[] a: array) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("=========================");

        for(int[] array2: array) {
            for(int a: array2) {
                System.out.print(a + ", ");
            }

        }
    }
}
