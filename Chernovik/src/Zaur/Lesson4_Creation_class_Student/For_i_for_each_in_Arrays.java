package Zaur.Lesson4_Creation_class_Student;
import java.util.Arrays;
public class For_i_for_each_in_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {100, 200, 300, 400};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);  // проход по ячейкам массива
            arr1[i] = arr1[i] + 5;    //изменение ячеек массива arr1
            arr2[i] = arr2[i] + 1;//можно изменить ячейки любого массива, но  массив.length == условиям
            //arr2[i] += 1; //короткий вариант записи
        }
        System.out.println(Arrays.toString(arr1)); // значения ячеек изменены
        System.out.println(Arrays.toString(arr2));

        System.out.println("==============");

        System.out.println(Arrays.toString(arr3));
        for(int i: arr3) {
            System.out.println(i+2); //печать измененных ячеек в рамках цикла
                  // но сам массив циклом fow-each изменить невозможно
        }
        System.out.println(Arrays.toString(arr3)); //в самом массиве изменений нет!
    }
}
