package Netologia_modifikatory.dostupa_nasledovanie;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        //person.name = "Petr";
        //person.age = -8;  //изолируем поля
        person.setName("Petr");
        person.setAge(40);  //добавляем возраст через метод
        person.setAge(-8);  //метод проверит на соответствие условиям и не пропустит

        System.out.println(person.getName());
        System.out.println(person.getAge()); // через getter возраста узнаем возраст
        System.out.println(person.isTooYoung());
        person.happyBurthday();

        Singer singer = new Singer("Tanya", 15, 4);
        singer.happyBurthday();
        System.out.println(singer.getAge());
        singer.sing("Гимн России");
        System.out.println(singer.toString());
    }
}
