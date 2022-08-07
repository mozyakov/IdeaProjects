import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        SavingsAccount saveAcc = new SavingsAccount();//
        saveAcc.setName("Сохранников");
        saveAcc.setBalance(10_000);
        System.out.println(saveAcc.getBalance());
        saveAcc.pay(5_000); //снятие true
        saveAcc.pay(5_000); //снятие false, нельзя опускать ниже мин.баланса
        saveAcc.add(10_000);   //пополнение true

        System.out.println("==========блок завершен==================");

        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.setName("Расчетников");
        checkAcc.setBalance(10_000);
        System.out.println(checkAcc.getBalance());
        checkAcc.pay(10_000); //снятие true
        checkAcc.pay(10_000); //снятие false, нельзя уходить в минус
        checkAcc.add(20_000);   //пополнение true

        System.out.println("==========блок завершен==================");

        CreditAccount credAcc = new CreditAccount(); //мой конструктор при создании обнуляет баланс!!!
        credAcc.setName("Кредитников");
        credAcc.setBalance(200_000); //мой конструктор при создании всё равно обнулит баланс!!!
        System.out.println(credAcc.getBalance());
        credAcc.pay(50_000); //снятие true, на этом счете снятие всегда будет true, минус не страшен
        credAcc.add(40_000); //пополнение true, потому что баланс пока в минусе
        credAcc.add(20_000); //пополнение false, иначе баланс станет положительным
    }
}