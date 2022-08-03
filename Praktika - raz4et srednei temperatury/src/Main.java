import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temps = new int[30];
        boolean[] isFilled = new boolean[30]; // по умолчанию все ячейки false, ввел юзер или нет
        while(true) {
            System.out.println("Введи два часла: дата температура");
            String input = scanner.nextLine(); //11 31  дата и число
            if (input.equals("end")) {
                System.out.println("Программа завершена");
                break;
            }
            String[] parts = input.split(" "); // ["11", "31"]
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temps[day] = t;
            isFilled[day] = true; //если юзер ввел температуру дня - ставим тру

            double sum = 0;
            for( int temp : temps) {
                sum += temp;
            }
            int cnt = 0; //счетчик заполненных дней
            for (boolean f : isFilled) {
                if (f) {     //при заполнении f
                    cnt++;   //будет пополняться счетчик
                }
            }
            System.out.println("Средняя температура : " + (sum / cnt));
            int[] arr = {5, 3, 9, 7};
            System.out.println(Arrays.toString(arr));
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for ( int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Максимальное значение равно = " + max);
            System.out.println("Минимальное значение равно = " + min);
        }
    }
}