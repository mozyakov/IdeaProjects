package accounts;

public class CreditAccount extends Account {


    @Override
    public void setBalance(long balance) {
        this.balance = balance - balance; //обнуляем баланс при создании объекта
    }

    @Override
    public long add(long amount) {
        if (balance + amount <= 0) {  //условие пополнения, нельзя допустить положительный баланс
            balance += amount;
            System.out.println(balance <= 0); //пополнение true, баланс всё равно отрицательный
        } else {
            System.out.println(balance > 0); //пополнение false, пишу заведомо неверное чтоб получить false
        }
        return balance;
    }
}





