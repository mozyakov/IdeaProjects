import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        /*SavingsAccount sA = new SavingsAccount("Ivanov", 12_500, 1_000);

        System.out.println(sA.getName());
        sA.pay(12_000);
        System.out.println(sA.balance);
        sA.pay(12_000);
        System.out.println(sA.balance);
         */
        CheckingAccount cA = new CheckingAccount("расчетный счет", 10_000);
        //System.out.println(cA.balance);
        cA.pay(9_000); //тратим сумму не превышающую баланс
        //System.out.println(cA.balance); //показ счета
        cA.pay(9_000); //снятие превышает баланс - будет отказ

    }
}