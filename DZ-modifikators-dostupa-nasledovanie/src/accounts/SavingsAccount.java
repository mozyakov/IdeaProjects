package accounts;

public class SavingsAccount extends Account { //накопительный счет
    protected long minBalance = 1_000;

    public void getMinBalance() {
        System.out.println("Мин.баланс SavingsAccount = " + minBalance);
    }

    @Override
    public long pay(long amount) {
        long oldBalance = balance;
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, пишу так чтоб показать false
        }
        return balance;
    }
}