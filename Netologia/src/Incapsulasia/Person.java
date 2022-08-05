package Incapsulasia;

public class Person {
    String name;
    int age;

    public void setAge (int Age) {
        this.age = age;
    }

    public boolean isTooYung () {
        if (age < 18) {
            return true;
        } else {
            return false;
        }
    }
}
