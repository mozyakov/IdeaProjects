package VideoCourse.Lesson18_Arrays;
import java.util.Arrays;

public class Test4_sort_binary_search {
    public static void main(String[] args) {
       int[] arr1 = {1, 9, 3, -8, 0, 5, 4, 1};

       for(int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
       }
        System.out.println();
       Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int index1 = Arrays.binarySearch(arr1,-8 ); //корр.работает только в отсортированном массиве
        System.out.println(index1);  //покажет индекс запрошенного значения в массиве



    }
}
