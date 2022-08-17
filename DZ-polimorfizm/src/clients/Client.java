package clients;
import accounts.Account;

public class Client {
    protected String name;
    protected int countAccounts = 0;
    //public String [] accounts = new String[]{"empty", "empty", "empty"};
    //public String [] accounts = new String[3];
    public Account [] accounts = new Account[3];

    public Client(int accounts) {
        this.accounts = new Account[3];
        System.out.println("new клиент, 0 счетов, макс/ кол-во счетов:3");
    }

    public void getName() {
        System.out.println("имя клиента : " + name);
    }
    public void getCountAccounts() {
        System.out.println("кол-во счетов "+ countAccounts);
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                countAccounts +=1;
                return;
            }
        }
        // если дошли сюда, значит не нашлось свободной ячейки, иначе бы уже ушли из for
        System.out.println("Мест для добавления нового счёта нет!");
    }

    /*public void add(String account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                countAccounts +=1;
                return;
            }
        }
        // все ячейки заняты
        System.out.println("у вас уже макс.кол-во счетов");
    }*/

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                accounts[i] = null; //раз счет использовался - он израсходован
                return true;

            } else if(accounts[i] == null) {
                return false;
            }
        }return true;
    }

    /*  вариант со стриннгами мой
        public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == "accounts") {
                return true;
            } else if(accounts[i] == null) {
                return false;
            }
        }return true;
    }
     */
    /*public void add(int i) {  //метод добавления счета
        if(countAccounts < 3 && countAccounts + i <= 3) {
            countAccounts += i;
        }else {
            System.out.println("у клиента уже макс.кол-во счетов(3)");
        }
    }
    */
}
