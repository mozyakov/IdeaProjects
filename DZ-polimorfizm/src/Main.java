import accounts.*;   //импорт всех классов из пакета
import clients.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(5);
        //5 не сработает - конструктор блокирует создание счетов
        client.setName("Petr");

        System.out.println(Arrays.toString(client.accounts));  //массив счетов есть

        System.out.println(client.pay(5000));  //false - нет открытых счетов

        client.add(new Account()); //добавляем (открываем) счет
        client.add(new Account()); //добавляем (открываем) счет
        client.add(new Account()); //добавляем (открываем) счет
        client.add(new Account()); //false - уже достигли макс.кол-ва счетов(3)

        System.out.println("===============================");

        client.getCountAccounts();  //сколько счетов у клиента
        System.out.println(client.pay(5000));  //true - есть открытые счета

    }
}