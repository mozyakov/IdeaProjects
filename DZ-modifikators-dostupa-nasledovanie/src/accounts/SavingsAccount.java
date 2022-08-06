package accounts;
public class SavingsAccount extends Account { //накопительный счет
    public long minBalance;

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void add(long amount) {
        long balanceDo = balance;
        balance += amount;
        boolean result = (balanceDo < balance);
        System.out.println(result);
    }

    @Override
    public void pay(long amount) {
        long balanceBefore = balance;
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println((balanceBefore > balance)); //снятие прошло, значит баланс до и сейчас не равны поэтому true

        } else {
            System.out.println("Баланс не может быть меньше минимума - в операции отказано");
            System.out.println((balanceBefore > balance)); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишем от обратного

        }
    }
}