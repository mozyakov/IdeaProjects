package Zaur.Lesson11_primitive_and_referense_in_method;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name); //изменения живут только внутри метода!
    }
    public static void changeName(Student s1) {
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3 );
        swap(st1, st2); //изменения умрут сразу после этой строки
        System.out.println(st1.name); //без изменений
        System.out.println(st2.name);
        changeName(st2); //сработает, потому что меняем значение внутри объекта, а не сам объект
        System.out.println(st2.name);

    }
}
