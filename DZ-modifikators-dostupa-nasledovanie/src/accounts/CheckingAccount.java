package accounts;

public class CheckingAccount extends Account{ //расчётный счет
    public long minBalance;

    public CheckingAccount( String name, long balance) {
        super(name, balance);
        //this.minBalance = minBalance;
    }

    @Override
    long add(long b) {
        return balance += b;
    }

    @Override
    public long pay(long a) {
        if (balance > a) {
            balance -= a;
            return balance;
        } else{
            System.out.println("Размер снятия превышает ваш счет: в выполнении отказано");

        }
        return balance;
    }





}
