package accounts;

class Account {
    String name;
    long balance;

    Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    void add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println((oldBalance < balance)); //true, при пополнении старый всегда меньше теперешнего
    }

    void pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println((oldBalance > balance)); //true, при снятии старый всегда больше теперешнего
    }
}
