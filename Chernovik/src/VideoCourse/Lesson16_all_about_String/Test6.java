package VideoCourse.Lesson16_all_about_String;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "PRIVET:2";
        String s2 = s1.toLowerCase(); //буквы станут маленькими
        System.out.println("PRIVET".toLowerCase());
        System.out.println("poka".toUpperCase());  //буквы станут большими

        boolean b = s1.contains(":2");  //метод проверки содержания
        System.out.println(b);
    }
}
