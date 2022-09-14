package Zaur.Lesson17_StringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();  // по умолчанию для начала вместимость 16 символов, значение динамическое
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50); //это не int, это вместимость 50 символов!
        StringBuilder sb4 = new StringBuilder(sb2);
        System.out.println(sb4 == sb2);
        System.out.println(sb4.equals(sb3));
        System.out.println(sb2.length());
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(0)); //покажет символ 0 индекса это G
        System.out.println(sb2.indexOf(" "));  //покажет индекс пробела

        String s1 = new String("asd");
        String s2 = new String("asd");

        System.out.println(s1 == s2);
    }
}
