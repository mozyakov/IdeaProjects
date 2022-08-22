package HomeWork.Lesson18;
import java.util.Arrays;
public class Soedinenie_massivov {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(combineArrays(arr1, arr2)));
        System.out.println("=======================");
        for(int i = 0; i < combineArrays(arr1, arr2).length; i++) {
            combineArrays(arr1, arr2)[i] = i;
            System.out.println(combineArrays(arr1, arr2)[i]);
        }
        System.out.println("=======================");
        for(int i: combineArrays(arr1, arr2)) {
            System.out.println(i);
        }
        System.out.println("=======================");
        int[] x = combineArrays(new int[]{11, 22, 33,}, new int[]{44, 55, 66});
        int k = 0;
        while(k < x.length) {
            System.out.println(x[k]);
            k++;
        }
        System.out.println("=======================");
        System.out.println(Arrays.toString(x));

    }


    public static  int[] combineArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = 0;
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[j];
            j++;
        }
        return c;
    }

    public static void multiElement(int[] array, int value) { //метод изменяет элементы массива
        for (int i = 0; i < array.length; i++) {   //а не просто выводит временные изменения
            int a = array[i] * value;
            System.out.print(a + ", ");
        }
    }




}
