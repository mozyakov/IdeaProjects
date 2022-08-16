package Lesson4_Creation_class_Student;

public class Car {
    Car(String cvet, String motor ) { //создаю коструктор
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины:"+color+" мотор:"+engine);
    }
    String color; //переношу данные наверх в конструктор, тип должен совпадать с типом в конструкторе!
    String engine; //переношу данные наверх в конструктор, тип должен совпадать с типом в конструкторе!
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет:" + color + " мотор:" + engine + " скорость:" + speed);
    }
}

class CarTest {
public static void main(String[]args){
    Car c1 = new Car("black", "V8");
    //c1.color = "black"; уже передал параметры вверху в конструктор
    //c1.engine = "V8"; уже передал параметры вверху в конструктор
    c1.speed = 60;

    Car c2 = new Car("whyte", "V6");

    c1.showInfo();
    c1.gaz(20);
    c1.showInfo();
    c1.tormoz(80);
    c1.showInfo();


    }
}