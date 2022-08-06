package accounts;

public class CheckingAccount extends Account{ //расчётный счет
    public long minBalance = 0;

    public CheckingAccount( String name, long balance) {
        super(name, balance);
        //this.minBalance = minBalance;
    }

   // @Override
    //public long add(long b) {
     //   return balance += b;
    //}
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
        if (amount <= balance) {
            balance -= amount;
            System.out.println((balanceBefore > balance)); //снятие прошло, значит баланс до и сейчас не равны поэтому true
            //boolean result = (balanceBefore > balance); //снятие прошло, значит баланс до и сейчас не равны поэтому true
            //System.out.println(result);
        } else {
            System.out.println("Баланс не может быть меньше минимума - в операции отказано");
            System.out.println((balanceBefore > balance)); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишем от обратного
            //boolean result = (balanceBefore > balance); //снятие не прошло, баланс до и сейчас равны, но нужен false поэтому пишем от обратного
            //System.out.println(result);
        }
    }

}
