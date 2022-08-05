package accounts;

public class Account {
    public String name;
    public long balance;

    public Account (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }


    long pay(long a) {
        return balance -= a;
    }

    long add(long b) {
        return balance += b;
    }

    public String getName() {
        return name;
    }
}
