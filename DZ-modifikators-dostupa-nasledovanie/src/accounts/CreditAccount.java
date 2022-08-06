package accounts;

public class CreditAccount extends Account { //кредитный счет

    public CreditAccount(String name, long balance) {
        super(name, balance = 0); //принудительно баланс 0, если при создании прописать другое, баланс всё равно будет 0
    }

    @Override
    public void add(long amount) {
        if ((balance + amount) <= 0) {
            balance += amount;
            System.out.println((balance <= 0)); //пополнение true, баланс не ушёл в плюс

        } else {
            System.out.println("Не выполнено");
            System.out.println((balance > 0)); //пополнение false, пишу так чтоб получить false
        }
    }

    @Override
    public void pay(long amount) {
        long balanceBefore = balance;
        balance -= amount;
        System.out.println(balanceBefore > balance); //всегда покажет true
    }
}



