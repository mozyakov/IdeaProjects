package Zaur.Lesson15_while_do_while;
import java.util.Arrays;
public class Test7 {
    public static void main(String[] args) {
//        while(5==5) {   //вечный цикл
//            System.out.println("hello");
//        }

        int [] arr = new int [] {100, 200, 300};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i <arr.length; i++) {
            arr[i] += 1;
        }
        System.out.println(Arrays.toString(arr));


    }
}
