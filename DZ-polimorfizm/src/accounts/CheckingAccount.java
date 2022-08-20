package accounts;

public class CheckingAccount extends Account { //расчётный счет
    protected long minBalance = 0;

    public static void pay() {

    }

    public void getMinBalance() {
        System.out.println("Мин.баланс CheckingAccount = " + minBalance);
    }

    @Override
    public boolean pay(long amount) {
        long oldBalance = balance;
        if (amount <= balance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return true;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишу от обратного
            return false;
        }
    }
}
