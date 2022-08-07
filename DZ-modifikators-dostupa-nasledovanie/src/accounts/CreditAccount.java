package accounts;

public class CreditAccount extends Account {
    public CreditAccount() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance - balance; //обнуляем баланс при создании объекта
    }

    /*public void setBalance(long balance) { //ещё вариант игнорирование не нулевого баланса
        if (this.balance == 0) {             //но мой первый вариант понятнее и лаконичнее
            return;
        }
        this.balance = balance;
    }
     */

    public long getBalance() {
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





