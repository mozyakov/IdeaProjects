package Lesson4_Creation_class_Student;

public class Human { //создал класс с перечислением характеристик
    String name;
    Car3 car;
    BankAccount2 ba;

    void info() {
        System.out.println("Имя:"+name+" Цвет машины:"+car.color+" Баланс счета:"+ba.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();  //создаем человека с определенными параметрами
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.ba = new BankAccount2(18, 200.50);
        h.info();
    }
}

class Car3 {
    Car3(String c, String e) { //в класс добавил конструктор с характеристиками
     color = c;
     engine = e;
    }
    String color;
    String engine;
}

class BankAccount2 {
    public String name;

    BankAccount2(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

    public BankAccount2() {

    }

    public void popolnenieScheta(int i) {
    }

    public void snyatieSoScheta(int i) {
    }
}