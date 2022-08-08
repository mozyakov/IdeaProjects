package accounts;

public class CreditAcc extends Account {

    @Override
    public void setBalance(long balance) {
        this.balance = balance - balance; //обнуляем баланс при создании объекта
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
}





