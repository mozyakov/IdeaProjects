package accounts;

public class SavingsAccount  extends Account { //накопительный счет
    public String name;
    public long balance;
    public long minBalance = 1000;

    public SavingsAccount( String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public long pay(long a) {
        if (balance >= 1000) {
            balance -= a;
            return balance;
        } else{
            System.out.println("Минимальный баланс достиг критического уровня");
        }
        return minBalance;
    }

    @Override
    long add(long b) {
        return balance += b;
    }


}
