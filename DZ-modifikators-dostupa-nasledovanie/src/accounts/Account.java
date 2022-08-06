package accounts;

class Account {
    String name;
    long balance;

    Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    //void add(long amount) {
    public long add(long amount) {
        long oldBalance = balance;
        balance += amount;
        System.out.println(oldBalance < balance);
        return balance;
        //return (oldBalance < balance); //true, при пополнении старый всегда меньше теперешнего
        //System.out.println((oldBalance < balance)); //true, при пополнении старый всегда меньше теперешнего
    }
    /*
        //void add(long amount) {
    public long add(long amount) {
        long oldBalance = balance;
        balance += amount;
        boolean result = (oldBalance < balance);
        return balance;
        //return (oldBalance < balance); //true, при пополнении старый всегда меньше теперешнего
        //System.out.println((oldBalance < balance)); //true, при пополнении старый всегда меньше теперешнего
    }
     */

    public long pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println(oldBalance > balance); //true, при снятии старый всегда больше теперешнего
        return balance;
    }
    /*
        void pay(long amount) {
        long oldBalance = balance;
        balance -= amount;
        System.out.println((oldBalance > balance)); //true, при снятии старый всегда больше теперешнего
    }
     */
}
