package Incapsulasia;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        //person.name = "Petr";
        //person.age = -8;

        person.setAge(8);

        System.out.println(person.age);
        System.out.println(person.isTooYung());
    }
}
