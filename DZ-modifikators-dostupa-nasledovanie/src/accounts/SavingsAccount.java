package accounts;

public class SavingsAccount extends Account { //накопительный счет
    protected long minBalance = 1_000;

    public SavingsAccount() {
    }

    SavingsAccount(String name, long balance) {
        super(name, balance); //наследуем параметры родителя
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public long add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println(oldBalance < balance);
        return balance;
    }

    @Override
    public long pay(long amount) {
        long oldBalance = balance;
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return balance;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, пишу неверно чтоб показать false
            return balance;
        }
    }
}