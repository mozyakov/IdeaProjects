package accounts;

public class Account {
    String name;
    public long balance;

    public Account (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }


    public void add(long b) {
            balance += b;
            boolean boo = (balance > balance+b);
            //return true;
    }


    public long pay(long a) {
        balance -= a;
        return balance;
    }

    public String getName() {
        return name;
    }
}
