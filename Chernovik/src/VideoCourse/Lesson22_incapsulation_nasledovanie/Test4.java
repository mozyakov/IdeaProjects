package VideoCourse.Lesson22_incapsulation_nasledovanie;

public class Test4 {
}

class Human2 {

    Human2(String name, String lastname) {
        this.name = name;
        this.lastname = name;
    }

    String name;
    String lastname;
}
 class Student2 extends Human2{
    int course;

    Student2(String name, String lastname, int course) {
        super(name, lastname);
        this.course = course;
    }

     public static void main(String[] args) {
         Student2 s = new Student2("Kolya", "Ivanov", 3);
         System.out.println(s.name);
         System.out.println(s.lastname);
         System.out.println(s.course);
     }
 }