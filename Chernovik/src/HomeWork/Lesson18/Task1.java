package HomeWork.Lesson18;
import java.util.Arrays;
public class Task1 {

        public static int sortirovka(int[] array) {
            /*По очереди будем просматривать все подмножества элементов массива
            (0 - последний, 1-последний, 2-последний,...)*/
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int min_i = i;
                /*В оставшейся части подмножества ищем элемент,
                который меньше предположенного минимума*/
                for (int j = i + 1; j < array.length; j++) { //Если нашли, запоминаем его индекс
                    if (array[j] < min) {
                        min = array[j];
                        min_i = j;
                    }
                    /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
                    if (i != min_i) {
                        int tmp = array[i];
                        array[i] = array[min_i];
                        array[min_i] = tmp;
                    }
                }
                System.out.println(array[i]);
            }
            return 0;
        }


        public static void main (String[]args){
            int[] array = {4, 5, 3, 1, 6, 0, -3, 7, -3};
            sortirovka(array);
            System.out.println("==========================");

        }
}
