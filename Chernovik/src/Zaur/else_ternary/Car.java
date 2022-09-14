package Zaur.else_ternary;

public class Car {   //создал класс, объявил его параметры
    String color = "red";
    int engine;
    int countDoors;
    Car(int engine, int countDoors) {  //конструктор класса
        this.engine = engine;
        this.countDoors = countDoors;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(1, 4);
        Car c2 = new Car(2, 5);



        if(c1.engine > c2.engine) {
            if(c1.countDoors > c2.countDoors)
                System.out.println("Мощность мотора и кол-во дверей у первой машины больше");
        }
        else
            System.out.println("Мощность мотора у первой машины больше, а кол-во дверей меньше");
        System.out.println("========================");
        Car c3 = new Car( 4, 2);
        Car c4 = new Car( 4, 2);
        Car c5 = c4;  //true, с5 присвоили указатель на тот же объект из с4
//для сравнения reference типов использовать ТОЛЬКО метод equals
        System.out.println(c3.equals(c4));  //false, это два РАЗНЫХ объекта просто с = значениями
        System.out.println(c3.color.equals(c4.color)); //true
        System.out.println(c4.equals(c5));  //true

    }
}
