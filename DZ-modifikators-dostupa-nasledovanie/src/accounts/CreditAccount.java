package accounts;

public class CreditAccount extends Account {
    public CreditAccount() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalanse(long balance) {
        this.balance = balance - balance; //обнуляем баланс при создании объекта
    }

    public long getBalanse() {
        return balance;
    }

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

    @Override
    public long pay(long amount) {
        long balanceBefore = balance;
        balance -= amount;
        System.out.println(balanceBefore > balance); //всегда покажет true
        return balance;
    }
}





