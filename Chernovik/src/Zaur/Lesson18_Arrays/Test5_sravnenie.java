package Zaur.Lesson18_Arrays;

public class Test5_sravnenie {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 3, -8, 0, 5, 4, 1}; //ссылка на один объект
        int[] arr2 = {1, 9, 3, -8, 0, 5, 4, 1}; //ссылка на ДРУГОЙ объект

        int[] arr3 = arr2;  //а здесь присвоение ТОГО ЖЕ объекта поэтому полное ==

        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));

        System.out.println(arr3 == arr2);
        System.out.println(arr3.equals(arr2));

    }
}
