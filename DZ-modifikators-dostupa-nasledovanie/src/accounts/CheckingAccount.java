package accounts;

public class CheckingAccount extends Account { //расчётный счет
    protected long minBalance = 0;

    public CheckingAccount() {
    }

    CheckingAccount(String name, long balance) {
        super(name, balance); //наследуем параметры родителя
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalanse(long balance) {
        this.balance = balance;
    }

    public long getBalanse() {
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
