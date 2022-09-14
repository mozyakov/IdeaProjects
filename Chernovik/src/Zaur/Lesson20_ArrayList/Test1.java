package Zaur.Lesson20_ArrayList;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuffer("ok"));
        //но лучше в ArrayList добавлять объекты одного типа данных

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("poka");
    }
}


class Car{}
class Student{}