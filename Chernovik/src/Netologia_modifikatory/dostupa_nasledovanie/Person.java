package Netologia_modifikatory.dostupa_nasledovanie;

public class Person {
    protected String name;
    protected int age; //private ограничиваем доступ

    Person () {} // конструктор класса без параметров

    Person (String name, int age) { //конструктор класса
        this.name = name;
        this.age = age;
    }

    public void happyBurthday() {
        age++;
        System.out.println("С днем рождения!");
    }

    public void setName(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setAge (int age) { //метод setter устанавливает значения
        if (age < 0 || age > 200) { //проверка условий
            return;
        }
        this.age = age;
    }

    public int getAge() { //метод getter возвращает значение
        return age;
    }

    public boolean isTooYoung () {
        if (age < 18) {
            //System.out.println("Ещё нет 18 лет");
            return true;
        } else {
            return false;
        }
    }
}
