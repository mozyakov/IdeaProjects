package Lesson8_final_static;

public class Student {
    String name;  //а это object variable - принадлежащая объекту
    int course;
    static int count; //чтобы это переменная изменялась из метода делаем её static и она становится class variable
    //static значит общий
    int a;

    public Student(String name, int course) {
        count++; // указываем для обновления за пределами конструктора
        this.name = name;
        this.course = course ;
        System.out.println("Студент # "+count+" создан");
    }

    public static void showCount() {
        System.out.println("Кол-во созданных студентов = " +count);
    }
    public void showInfo() {
        System.out.println("Welcome to the Student class");
    }
    void abc() { //nonstatic метод может изменять
        a++;     //nonstatic переменные
        count++; //и static переменные
    }
    //static void abcd() { //static метод не может использовать nonstatic переменные,
    //    a++;             //потому что им необходим объект

    static void abcd() {
        Student st2 = new Student("Petr", 1);
        st2.a++; //вот можно использовать nonstatic переменную внутри st2 объекта класса Student;
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);
        System.out.println(Student.count); //указываем имя класса, count принадлежит именно классу
        Student.showCount();
        abcd(); //метод можно вызвать без создания объекта

        Student st4 = new Student("Ivan", 4); //создан объект
        st4.abc(); //nonstatic метод нельзя вызвать без создания объекта, но если объект создан то можно с ним.

    }
}
