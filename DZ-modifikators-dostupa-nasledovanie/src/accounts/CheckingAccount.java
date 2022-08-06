package accounts;

public class CheckingAccount extends Account { //расчётный счет
    public long minBalance = 0;

    public CheckingAccount(String name, long balance) {
        super(name, balance); //наследуем параметры родителя
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
        if (amount <= balance) {
            balance -= amount;
            System.out.println((oldBalance > balance)); //снятие прошло, поэтому true
        } else {
            System.out.println((oldBalance != balance)); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишу от обратного
        }
    }
}
