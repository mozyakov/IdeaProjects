package accounts;
public class CheckingAccount extends Account{ //расчётный счет
    public long minBalance = 0;

    public CheckingAccount( String name, long balance) {
        super(name, balance);
    }

   @Override
   public void add(long amount) {
       long balanceDo = balance;
       balance += amount;
       System.out.println((balanceDo < balance));
   }

    @Override
    public void pay(long amount) {
        long balanceBefore = balance;
        if (amount <= balance) {
            balance -= amount;
            System.out.println((balanceBefore > balance)); //снятие прошло, значит баланс до и сейчас не равны поэтому true
        } else {
            System.out.println((balanceBefore > balance)); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишем от обратного
        }
    }
}
