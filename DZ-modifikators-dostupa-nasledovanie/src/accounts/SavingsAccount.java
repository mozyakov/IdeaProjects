package accounts;

public class SavingsAccount  extends Account { //накопительный счет
    public long minBalance;

    public SavingsAccount( String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    //@Override
    //public  add(long b) {
        //return balance += b;
    //}

    @Override
    public void add(long b) {
        long balanceDo = balance;
        balance += b;
        boolean boo = (balanceDo < balance);
        System.out.println(boo);
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
