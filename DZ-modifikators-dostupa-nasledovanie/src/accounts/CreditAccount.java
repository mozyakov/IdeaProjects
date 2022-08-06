package accounts;

public class CreditAccount extends Account { //кредитный счет
    protected long balance = 0;
    public CreditAccount() {}

    public CreditAccount(String name, long balance) {
        super(name, balance); //наследуем параметры родителя
        this.balance = balance - balance; //обнуляем баланс при создании
    }
    public void setName(String name) {this.name = name;}
    public void setBalanse(long balance) {this.balance = balance;}
    public  long getBalanse() {return balance;}
    //public long getBalance() { return 0;}

    @Override
    public long add(long amount) {
        if ((balance + amount) <= 0) {
            balance += amount;
            System.out.println(balance <= 0); //пополнение true, баланс всё равно отрицательный
            return balance;

        } else {
            System.out.println(balance > 0); //пополнение false, пишу заведомо неверное чтоб получить false
            return balance;
        }
    }
    /*
        @Override
    public void add(long amount) {
        if ((balance + amount) <= 0) {
            balance += amount;
            System.out.println((balance <= 0)); //пополнение true, баланс всё равно отрицательный

        } else {
            System.out.println((balance > 0)); //пополнение false, пишу заведомо неверное чтоб получить false
        }
    }
     */

    @Override
    public long pay(long amount) {
        long balanceBefore = balance;
        balance -= amount;
        System.out.println(balanceBefore > balance); //всегда покажет true
        return balance;
    }


    /*
        @Override
    public void pay(long amount) {
        long balanceBefore = balance;
        balance -= amount;
        System.out.println(balanceBefore > balance); //всегда покажет true
    }
     */
}



