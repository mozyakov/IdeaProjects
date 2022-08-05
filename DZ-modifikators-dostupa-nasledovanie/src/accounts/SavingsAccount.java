package accounts;

public class SavingsAccount  extends Account { //накопительный счет
    public long minBalance = 1000;

    public SavingsAccount( String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }


}
