package accounts;

public class SavingsAccount extends Account { //накопительный счет
    public long minBalance;

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println((oldBalance < balance));
    }

    @Override
    public void pay(long amount) {
        long oldBalance = balance;
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println((oldBalance > balance)); //снятие прошло, поэтому true

        } else {
            System.out.println("Баланс не может быть меньше минимума - в операции отказано");
            System.out.println((oldBalance != balance)); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишу от обратного
        }
    }
}