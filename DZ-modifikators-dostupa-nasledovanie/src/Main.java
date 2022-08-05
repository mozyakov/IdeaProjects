import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sA = new SavingsAccount("Ivanov", 10_000, 1_000);


        sA.pay(5_000);
        System.out.println("баланс счета sA = " + sA.balance);
        sA.pay(7_000);
        sA.add(10_000);
        System.out.println("баланс счета sA = " + sA.balance);

        System.out.println("====================");

        CheckingAccount cA = new CheckingAccount("расчетный счет", 10_000);

        System.out.println(cA.balance);
        cA.pay(9_000); //тратим сумму не превышающую баланс
        System.out.println(cA.balance); //показ счета
        cA.pay(9_000); //снятие превышает баланс - будет отказ
        cA.add(20_000);
        System.out.println(cA.balance); //показ счета


    }
}