package accounts;

public class Account {
    String name;
    long balance;

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
