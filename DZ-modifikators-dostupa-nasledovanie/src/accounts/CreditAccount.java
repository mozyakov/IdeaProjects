package accounts;

public class CreditAccount extends Account { //кредитный счет
    public long balance;

    public CreditAccount(String name, long balance) {
        super(name, balance); //наследуем параметры родителя
        this.balance = balance - balance; //обнуляем баланс при создании
    }

    @Override
    public void add(long amount) {
        if ((balance + amount) <= 0) {
            balance += amount;
            System.out.println((balance <= 0)); //пополнение true, баланс всё равно отрицательный

        } else {
            System.out.println((balance > 0)); //пополнение false, пишу заведомо неверное чтоб получить false
        }
    }

    @Override
    public void pay(long amount) {
        long balanceBefore = balance;
        balance -= amount;
        System.out.println(balanceBefore > balance); //всегда покажет true
    }
}



