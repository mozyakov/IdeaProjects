package HomeWork.Lesson18;
import java.util.Arrays;
public class Sortirovka_massiva_int_vozrastanio {

    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 10, 1, 6, 0, -3, 7, -3};
        System.out.println(Arrays.toString(arr1)); //изначальный массив
        sortirovka(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1)); //возвращенный массив
        System.out.println("==========================");

        int[] arr2 = {5, 3, 6, -1, 4, -1, 2};
        System.out.println(Arrays.toString(arr2));
        sortirovka(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println(Arrays.toString(arr2));

    }
}
