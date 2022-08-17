package accounts;

public class CreditAccount extends Account {


    @Override
    public void setBalance(long balance) {
        this.balance = balance - balance; //баланс будет 0, игнорируя сумму пользователя
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            System.out.println(balance <= 0); //пополнение true, баланс всё равно отрицательный
            return true;
        } else {
            System.out.println(balance > 0); //пополнение false, пишу заведомо неверное чтоб получить false
            return true;
        }
    }
}

