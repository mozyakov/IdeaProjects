package accounts;
public class Account {
    String name;
    public long balance;

    public Account (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
    public void add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println((oldBalance < balance)); //true, при пополнении старый всегда меньше теперешнего
    }

    public void pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println((oldBalance > balance)); //true, при снятии старый всегда больше теперешнего
    }
}
