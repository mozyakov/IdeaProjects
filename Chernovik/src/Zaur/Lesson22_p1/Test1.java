package Zaur.Lesson22_p1;
import Zaur.Lesson22_incapsulation_nasledovanie.*;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setWeight(50);
        c.setAge(15);
        System.out.println("имя " + c.getName());
        System.out.println("возраст" + c.getAge());
        System.out.println("вес" + c.getWeight());
    }
}
