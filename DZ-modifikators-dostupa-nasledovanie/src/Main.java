import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        /*
        SavingsAccount saveAcc = new SavingsAccount("Сохранников", 10_000, 1_000);
        saveAcc.pay(5_000); //снятие true
        saveAcc.pay(5_000); //снятие false, нельзя опускать ниже мин.баланса
        saveAcc.add(10_000);   //пополнение true
         */

        /*
        CheckingAccount checkAcc = new CheckingAccount("Расчетников", 10_000);
        checkAcc.pay(10_000); //снятие true
        checkAcc.pay(10_000); //снятие false, нельзя уходить в минус
        checkAcc.add(20_000);   //пополнение true
         */

        CreditAccount credAcc = new CreditAccount("Кредитников", 10_000); //проверяем что конструктор всё равно поставит 0
        System.out.println(credAcc.balance); //изначально баланс всегда 0, блокирую плюс в конструкторе
        credAcc.pay(50_000); //true, на этом счете снятие всегда будет true, метод родителя без изменений, потому что не боюсь минус
        System.out.println(credAcc.balance);
        credAcc.add(40_000); //пополнение true, потому что баланс всё равно в минусе
        System.out.println(credAcc.balance);
        credAcc.add(20_000); //пополнение false, иначе баланс станет положительным
        System.out.println(credAcc.balance);




    }
}