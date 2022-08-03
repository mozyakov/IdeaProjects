public class Main {
    public static void main(String[] args) {
        hello("world"); // в скобках параметр функции
        hello("user");
        hello("Алексей");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) { // somebody это параметр функции или аргумент
        System.out.println("Hello, " + somebody + "!");
    }
}