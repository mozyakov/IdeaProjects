package accounts;

class Account {
    protected String name;
    protected long balance;

    Account() {
    }

    Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    long add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println(oldBalance < balance); //true, при пополнении старый всегда меньше теперешнего
        return balance;

    }

    long pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println(oldBalance > balance); //true, при снятии старый всегда больше теперешнего
        return balance;
    }

}
