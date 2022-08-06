import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        /*
        SavingsAccount saveAcc = new SavingsAccount("накопительный счет", 10_000, 1_000);
        saveAcc.pay(5_000); //снятие успешно
        saveAcc.pay(5_000); //снятие не пройдет, нельзя опускать ниже мин.баланса
        saveAcc.add(10_000);   //пополнение успешно
        */

        /*
        CheckingAccount checkAcc = new CheckingAccount("расчетный счет", 10_000);

        checkAcc.pay(10_000); //снятие успешно
        checkAcc.pay(10_000); //снятие не пройдет, нельзя уходить в минус
        checkAcc.add(20_000);   //пополнение успешно
         */

        CreditAccount credAcc = new CreditAccount("кредитный счет", 10_000);



    }
}