import accounts.*;   //импорт всех классов из пакета
import clients.Client;

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

        Client client1 = new Client();
        client1.setName("Первый");
        client1.getName();
        client1.getCountAccounts();

    }
}