package Zaur.Lesson19_varargs_foreach;
import java.util.Arrays;
public class Test7_foreach {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        //for(int i = 0; i < array.length; i++) {
         //   array[i] = 3;
        //}
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        String[] array2 = {"ok1", "ok2", "ok3"};
        for(String s:array2) { //foreach меняет значения референс.типов только на время цикла
            s = new String("hello");
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array2) + "\n"); //массив остался прежним!

        StringBuilder sb1 = new StringBuilder("privet1");
        StringBuilder sb2 = new StringBuilder("privet2");
        StringBuilder sb3 = new StringBuilder("privet3");
        StringBuilder[] array3 = {sb1, sb2, sb3};
        for(StringBuilder sb:array3) { //foreach меняет значения референс.типов только на время цикла
            sb = new StringBuilder("hello");
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array3) +"\n"); //массив остался прежним!


        StringBuilder sb11 = new StringBuilder("privet1");
        StringBuilder sb22 = new StringBuilder("privet2");
        StringBuilder sb33 = new StringBuilder("privet3");
        StringBuilder[] array33 = {sb1, sb2, sb3};
        for(StringBuilder sb:array33) { //foreach меняет значения референс.типов только на время цикла
            sb.append("Java");  //изменяются значения внутри! массива
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array33)); //массив изменился!

    }
}
