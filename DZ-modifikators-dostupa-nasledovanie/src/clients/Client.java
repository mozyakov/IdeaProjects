package clients;
import accounts.Account;

import java.util.Arrays;

public class Client {
    protected String name;
    protected int countAccounts = 0;
    //public String [] accounts = new String[]{"empty", "empty", "empty"};
    //public String [] accounts = new String[3];
    protected Account [] accounts = new Account[3];
    //protected int [] accounts = new int[3];

    public Client(int accounts) {
        this.accounts = new Account[3]; //определяю макс.кол-во счетов в самом конструкторе
        System.out.println("new клиент, 0 счетов, макс/ кол-во счетов:3");
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
    public void getAccount() {
        System.out.println(Arrays.toString(accounts)); //показ массива через метод
    }

    /*public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == 0) {
                accounts[i] = 1;
                countAccounts +=1;
                System.out.println("Счет открыт, кол-во счетов " + countAccounts );
                return;
            }
        }
        // если дошли сюда, значит не нашлось свободной ячейки, иначе бы уже ушли из for
        System.out.println("Мест для добавления нового счёта нет!");
    }*/

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                countAccounts +=1;
                System.out.println("Счет открыт, кол-во счетов " + countAccounts );
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
    /*public boolean pay(int amount) { //теперь метод действительно перебирает где нет нуля
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == 0 && i < accounts.length) {
                continue;
            }
            if(accounts[i] == 0 && i == accounts.length) {
                return false;
            }
            else if(accounts[i] != 0) {
                countAccounts -= 1;   //есть счет найден, то он расходуется, но по условиям это лишнее
                accounts[i] -= 1;  //в использованную ячейку пишется null, но по условиям это лишнее
                return true;
            }
        }return false;
    }*/
    public boolean pay(int amount) { //теперь метод действительно перебирает где нет null
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null && i < accounts.length) {
                continue;
            }
            if(accounts[i] == null && i == accounts.length) {
                return false;
            }
            else if(accounts[i] != null) {
                countAccounts -=1;   //есть счет найден, то он расходуется, но по условиям это лишнее
                accounts[i] = null;  //в использованную ячейку пишется null, но по условиям это лишнее
                return true;
            }
        }return false;
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
