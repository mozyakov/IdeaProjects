package accounts;
import clients.*;
public class Account {
    protected String name;
    protected long balance;
    //protected int[] accounts = new int[3];
    public Account [] accounts = new Account[3];


    public Account() {}

    Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Баланс счета: " + balance);
    }

    public void getName() {
        System.out.println("имя счета: " + name);
    }
    public boolean add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println(oldBalance < balance); //true, при пополнении старый всегда меньше теперешнего
        return true;
    }
    public boolean pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println(oldBalance > balance); //true, при снятии старый всегда больше теперешнего
        return true;
    }
}
