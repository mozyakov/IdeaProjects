package Zaur.Lesson18_Arrays;
import java.util.Arrays;
public class Test1_static_initialization {
    public static void main(String[] args) {
        int[] arr1;
        String[] arr2;
        double[] [] arr3;
        int[][] arr10;
        double[] arr7;

        arr1 = new int[8];
        arr2 = new String[3];
        arr3 = new double[4][2];
        arr10 = new int[3][]; //разное кол-во элементов внутри массива одномерного уровня поэтому не указываем
        arr7 = new double[2];
        //ниже статическая инициализация (придание значений ячейкам массива)

        arr2[0] = "privet";
        arr2[1] = "poka";
        arr2[2] = "ok";

        arr3[0][0] = 3.14; //НЕ обязательно инициализировать все элементы
        arr3[2][1] = 3.14; //значения могут повторяться

        double[] arr5;
        arr5 = new double[2];
        arr5[0] = 2.5;
        arr5[1] = 3.5;
        arr7 = arr5; //ссылается на тот же объект что и arr5

        arr3[1] = arr5; //ссылается на тот же объект что и arr5

        System.out.println(Arrays.toString(arr7));
        System.out.println(arr3[1][0]); //также как у arr5
        System.out.println(arr3[1][1]);
        arr3[1][0] = 2.0; //смена объекта на который ссылался arr3[1][0]
        arr3[1][1] = 3.0;
        System.out.println(arr3[1][0]); //значения изменились
        System.out.println(arr3[1][1]);
        System.out.println(Arrays.toString(arr5)); //объект тоже сменился!!!
        System.out.println(Arrays.toString(arr7)); //и здесь!!!


    }
}
