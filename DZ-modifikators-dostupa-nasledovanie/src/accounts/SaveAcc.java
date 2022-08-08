package accounts;

public class SaveAcc extends Account { //накопительный счет
    protected long minBalance = 1_000;

    @Override
    public long pay(long amount) {
        long oldBalance = balance;
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return balance;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, пишу так чтоб показать false
            return balance;
        }
    }
}