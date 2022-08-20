package accounts;

public class SavingsAccount extends Account { //накопительный счет
    protected long minBalance = 1_000;


    public void getMinBalance() {
        System.out.println("Мин.баланс = " + minBalance);
    }

    @Override
    public boolean pay(long amount) {
        long oldBalance = balance;
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return true;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, пишу так чтоб показать false
            return false;
        }
    }
}