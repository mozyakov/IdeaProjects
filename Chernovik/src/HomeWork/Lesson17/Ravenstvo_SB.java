package HomeWork.Lesson17;
public class Ravenstvo_SB {
        public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
            if(sb1.length() == sb2.length()) {    //длина должна совпадать
                for(int i = 0; i <sb1.length(); i++) {
                    if(sb1.charAt(i) != sb2.charAt(i)) {   //сравнение посимвольно
                        return false;     //если символы разные сразу конец
                    }
                }
            }else {   //если длина разная то конец
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("helloooo");
        StringBuilder sb5 = new StringBuilder("Hello");

        //System.out.println(Ravenstvo_SB.ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(ravenstvo(sb3, sb5));
    }
}
