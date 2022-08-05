import accounts.Account;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        SavingsAccount a1 = new SavingsAccount("Ivanov", 12_500, 1_000);

        System.out.println(a1.getName());
    }
}