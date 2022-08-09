package accounts;

public class CreditAccount extends Account {

    @Override
    public void setParameters(String name, long balance) { //в одном методе несколько параметров
        this.name = name; //строчку баланс убрал, по умолчанию будет 0 значение
        //this.balance = balance; //если закоментить строку, то баланс тоже будет 0 при создании
    }

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





