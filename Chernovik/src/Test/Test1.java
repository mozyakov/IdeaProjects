package Test;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("Petr", 20);
        person.showInfo();

        String[] str = {"1", "2", "3"};
        for(String s: str) {
            System.out.println(s);
        }
    }
}


class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.printf("Name: %s \tAge: %s\n", name, age);
    }
}

