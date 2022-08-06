import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
/*
        SavingsAccount saveAcc = new SavingsAccount();//
        saveAcc.setName("Сохранников");
        saveAcc.setBalanse(10_000);
        System.out.println(saveAcc.getBalanse());
        saveAcc.pay(5_000); //снятие true
        saveAcc.pay(5_000); //снятие false, нельзя опускать ниже мин.баланса
        saveAcc.add(10_000);   //пополнение true

        System.out.println("==========блок завершен==================");

        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.setName("Расчетников");
        checkAcc.setBalanse(10_000);
        System.out.println(checkAcc.getBalanse());
        checkAcc.pay(10_000); //снятие true
        checkAcc.pay(10_000); //снятие false, нельзя уходить в минус
        checkAcc.add(20_000);   //пополнение true

        System.out.println("==========блок завершен==================");
*/
        CreditAccount credAcc = new CreditAccount(); //мой конструктор при создании обнуляет баланс!!!
        credAcc.setName("Кредитников");
        //credAcc.setBalanse(20_000); //мой конструктор при создании обнуляет баланс!!!
        //System.out.println(credAcc.getBalance());
        //credAcc.getBalance();
        //System.out.println(credAcc.balance); //изначально баланс всегда 0, показываю что конструктор не дал поставить положительное значение
        credAcc.pay(50_000); //снятие true, на этом счете снятие всегда будет true, потому что минус не страшен
        //System.out.println(credAcc.balance); //показ текущего баланса кредитного счета
        credAcc.add(40_000); //пополнение true, потому что баланс всё равно в минусе
        //System.out.println(credAcc.balance); //показ текущего баланса кредитного счета
        credAcc.add(20_000); //пополнение false, иначе баланс станет положительным
        //System.out.println(credAcc.balance); //показ текущего баланса кредитного счета



    }
}