package accounts;

public class SavingsAccount extends Account { //накопительный счет
    public long minBalance;

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance); //наследуем параметры родителя
        this.minBalance = minBalance;
    }

  @Override
    public long add(long amount) {
        long oldBalance = balance;
        balance += amount;
        //boolean result = (oldBalance < balance);
        System.out.println(oldBalance < balance);
        return balance;
        //System.out.println((oldBalance < balance));
    }
    /*
        @Override
    public void add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println((oldBalance < balance));
    }
     */

    @Override
    public long pay(long amount) {
        long oldBalance = balance;
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println(oldBalance > balance); //снятие прошло, поэтому true
            return balance;
        } else {
            System.out.println(oldBalance != balance); //снятие не прошло, пишу неверное чтоб показать false
            return balance;
        }
    }
    /*
        @Override
    public void pay(long amount) {
        long oldBalance = balance;
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println((oldBalance > balance)); //снятие прошло, поэтому true
        } else {
            System.out.println((oldBalance != balance)); //снятие не прошло, пишу неверное чтоб показать false
        }
    }
     */
}