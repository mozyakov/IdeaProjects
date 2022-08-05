package accounts;

public class SavingsAccount  extends Account { //накопительный счет
    public long minBalance;

    public SavingsAccount( String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public long add(long b) {
        return balance += b;
    }

    @Override
    public long pay(long a) {
        if ((balance - a) >= minBalance ) {
            balance -= a;
            return balance;
        } else{
            System.out.println("Баланс не может быть меньше минимума - в операции отказано");
        }
        return minBalance;
    }




}
