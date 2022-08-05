package accounts;

public class CheckingAccount extends Account{ //расчётный счет
    public long minBalance = 0;

    public CheckingAccount( String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }






}
