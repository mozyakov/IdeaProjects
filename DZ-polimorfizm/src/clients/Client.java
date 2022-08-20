package clients;
import accounts.Account;

public class Client {
    protected String name;
    protected int countAccounts = 0;
    public Account [] accounts = new Account[3];

    public Client(int accounts) {
        this.accounts = new Account[3];
        System.out.println("Клиент создан, сейчас счетов " + countAccounts);
        System.out.println("Mакс. кол-во счетов : 3");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("имя клиента : " + name);
    }
    public void getCountAccounts() {
        System.out.println("кол-во счетов "+ countAccounts);
    }

    public void add(Account account) {    //добавление счета
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                countAccounts +=1;
                System.out.println("Счет открыт, кол-во счетов " + countAccounts );
                return;
            }
        }
        // если дошли сюда значит открыто макс.кол-во счетов
        System.out.println("Мест для добавления нового счёта нет!");
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                return true;
            } else {
                return false;
            }
        }return true;
    }
}
