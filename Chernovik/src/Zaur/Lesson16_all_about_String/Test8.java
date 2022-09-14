package Zaur.Lesson16_all_about_String;
public class Test8 {
    public static void main(String[] args) {
        String str1 = "Чтоб мудро жизнь прожить, знать надобно немало,Два важных правила запомни для начала: Ты " +
                    "лучше голодай, чем что попало ешь,И лучше будь один, чем вместе с кем попало.";
        String str2 = str1.toUpperCase();
        char c1;
        char c2;
        for(int i = 0; i < str1.length(); i++) {
            c1 = str1.charAt(i);
            c2 = str2.charAt(i);
            if(c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1); //убрал ln иначе после большой буквы новая строка
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "papa";
        String s4 = "papa";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
