package Zaur.Lesson4_Creation_class_Student;

public class BankAccount {
    int id = 10;            //эти три параметра по-умолчанию
    String name = "Petr";
    double balance = 100;
    BankAccount(){};

    double popolnenieScheta(double popolnenie) {
        balance += popolnenie;
        return balance;
    }

    double snyatieSoScheta(double snyatie) {
        balance -= snyatie;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount2 MyAccount = new BankAccount2();
        BankAccount2 HisAccount = new BankAccount2();

        MyAccount.id = 1;
        //MyAccount.name = "Zaur"; //теперь при выводе этого объекта здесь будет имя по-умолчанию
        MyAccount.balance = 12.35;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println(MyAccount.name);  // покажет Petr потому что он по-умолчанию

        HisAccount.popolnenieScheta(100); // применил метод пополнения счета
        System.out.println("На счету Ивана теперь: " + HisAccount.balance);
        HisAccount.snyatieSoScheta(20);
        System.out.println("На счету Ивана теперь: " + HisAccount.balance);
        }
}