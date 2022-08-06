import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        SavingsAccount saveAcc = new SavingsAccount("Ivanov", 10_000, 1_000);
        System.out.println("баланс счета saveAcc = " + saveAcc.balance);
        saveAcc.pay(5_000); //снятие
        saveAcc.pay(5_000); //false снятие не пройдет - нельзя опускать ниже мин.баланса
        System.out.println("баланс счета saveAcc = " + saveAcc.balance);
        saveAcc.add(10_000);   //пополнение будет true
        System.out.println("баланс счета saveAcc = " + saveAcc.balance);

        System.out.println("====================");

        //CheckingAccount checkAcc = new CheckingAccount("расчетный счет", 10_000);

        //System.out.println("баланс счета checkAcc = " + checkAcc.balance); //показ счета
        //checkAcc.pay(9_000); //снятие
       // System.out.println("баланс счета checkAcc = " + checkAcc.balance); //показ счета
       // checkAcc.pay(9_000); //снятие превышает баланс - будет отказ
       // checkAcc.add(20_000);   //пополнение
       // System.out.println("баланс счета checkAcc = " + checkAcc.balance); //показ счета

        System.out.println("====================");


    }
}