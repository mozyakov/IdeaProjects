import accounts.*;   //импорт всех классов из пакета
import clients.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /*SavingsAccount saving = new SavingsAccount();
        saving.setName("Сохранников");
        saving.setBalance(10_000);
        saving.getBalance();;
        saving.getMinBalance();;
        saving.pay(5_000); //снятие true
        saving.pay(5_000); //снятие false, нельзя опускать ниже мин.баланса
        saving.add(10_000);   //пополнение true
        System.out.println("==========блок завершен==================");
        CheckingAccount check = new CheckingAccount();
        check.setName("Расчетников");
        check.setBalance(10_000);
        check.getMinBalance();
        check.pay(10_000); //снятие true
        check.pay(10_000); //снятие false, нельзя уходить в минус
        check.add(20_000);   //пополнение true
        System.out.println("==========блок завершен==================");
        CreditAccount cred = new CreditAccount();
        cred.setName("Кредитников");
        cred.setBalance(200_000); //как бы баланс в плюс, но
        //setter этого класса при создании всё равно обнулит баланс!!!
        cred.getBalance();  //setter класса сработал, баланс 0
        cred.pay(50_000); //снятие true, на этом счете снятие всегда будет true, минус не страшен
        cred.add(40_000); //пополнение true, потому что баланс пока в минусе
        cred.add(20_000); //пополнение false, иначе баланс станет положительным
         */

        Client client = new Client(5); //
        client.setName("Petr");
        //client.getCountAccounts();  //сколько счетов у клиента
        //System.out.println(Arrays.toString(client.accounts));
        client.getAccount();
        System.out.println(client.pay(5000));  //false - нет открытого счета
        client.add(new Account()); //добавляем счет
        client.add(new Account()); //добавляем счет
        client.add(new Account()); //добавляем счет
        client.getAccount();
        client.getCountAccounts();  //сколько счетов у клиента
        System.out.println(client.pay(5000));  //true - счет есть
        client.getAccount();
        client.getCountAccounts();  //сколько счетов у клиента
        System.out.println(client.pay(5000));
        client.getAccount();
        client.getCountAccounts();  //сколько счетов у клиента
        System.out.println(client.pay(5000));
        client.getAccount();  //все счета истрачены должно стать null везде
        System.out.println(client.pay(5000));   //false счета уже истрачены


        //client.add(new Account()); //добавляем счет
       // System.out.println(Arrays.toString(client.accounts)); //массив со счетами клиента
        //System.out.println(Arrays.toString(client.accounts));
        //client.getCountAccounts();  //сколько счетов у клиента
        //System.out.println(Arrays.toString(client.accounts));
        //client.add(new Account()); //добавляем счет
        //client.add(new Account()); //добавляем счет будет отказ - у клиента уже три счета
       // System.out.println(client.pay(5000));


    }
}