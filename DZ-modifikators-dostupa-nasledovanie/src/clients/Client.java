package clients;

public class Client {
    protected String name;
    protected int countAccounts = 0;
    protected int[] account = new int[3];

    public Client() {
        System.out.println("Максимальное кол-во счетов которое вы можете завести : 3");
    };
    //public Client(String name, int countMax) {
        //this.name = name;
        //this.countMax = countMax;
    //}

    public void setName(String name) {
        this.name = name;
    }
    //public void setCountMax(int countMax) {
        //this.countMax = countMax;
    //}
    public void getName() {
        System.out.println("имя клиента : " + name);
    }
    public void getCountAccounts() {
        System.out.println("у клиента " + name  + " кол-во счетов "+ countAccounts);
    }

}
