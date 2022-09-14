package Zaur.Lesson16_all_about_String;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet". trim();
        System.out.println(x == y); //true, ибо в данном случае метод trim не сделал никаких изменений

        String x2 = "privet";
        String y2 = " privet". trim();
        System.out.println(x2 == y2); //false, trim убрал пробел, но " privet" изначально другой объект
        System.out.println(x2.equals(y2)); // true, equals сравнивает содержание, после трима оно одинаковое, но это разные объекты!





    }
}
