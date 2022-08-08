package accounts;

public class CheckAcc extends Account { //расчётный счет
    protected long minBalance = 0;

    @Override
    public long pay(long amount) {
        long oldBalance = balance;
        if (amount <= balance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return balance;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишу от обратного
            return balance;
        }
    }
}
