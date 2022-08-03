import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Квас", "Мясо"};
        int[] prices = {10, 20, 50};
        System.out.println("Список товаров для покупки :");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + " " + products[i] + " цена " + prices[i] + " руб");
        }
        int[] countProducts = new int[3]; //кол-во товаров
        Scanner scan = new Scanner(System.in);
        int sumProducts = 0; //подсчет итогового чека
        while (true) {
            System.out.println("Выберите товар и количество или введите end ");
            String input = scan.nextLine(); //юзер вводит данные
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" "); //разделяем на две части
            int number = Integer.parseInt(parts[0]) - 1; //номер товара
            int count = Integer.parseInt(parts[1]); //кол-во товара
            if (countProducts[number] == 0) {
                countProducts[number] = count; //просто помещаю данные в ячейку массива
            } else {
                countProducts[number] += count; //складываю с предыдущим значением
            }
            //System.out.println("Кол-во товаров : " + Arrays.toString(countProducts));
        }
        for (int i = 0; i < products.length; i++) {
            if (countProducts[i] != 0) {  //чтобы цикл запускался только по выбранному товару
                System.out.println(products[i] + " " + countProducts[i] + " шт  в сумме " + (prices[i] * countProducts[i]) + " руб");
                sumProducts += (prices[i] * countProducts[i]);
            }
        }
        System.out.println("Общая сумма : " + sumProducts + " руб");
    }
}
