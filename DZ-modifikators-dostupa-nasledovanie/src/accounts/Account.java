package accounts;
public class Account {
    String name;
    public long balance;

    public Account (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
    public void add(long amount) {
        long balanceBefore = balance;
        balance += amount;
        boolean result = (balanceBefore < balance);
        System.out.println(result);
    }
    public void pay(long amount) {
        long balanceBefore = balance;
        //boolean result = (balanceBefore > balance);
        if (balance >= amount) {
            balance -= amount;
            boolean result = (balanceBefore > balance);
            System.out.println(result);
        }

    }
    //public String getName() {
        //return name;
    //}
}
