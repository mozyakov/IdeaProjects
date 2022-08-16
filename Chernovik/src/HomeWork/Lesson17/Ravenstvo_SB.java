package HomeWork.Lesson17;

public class Ravenstvo_SB {

        public static boolean ravenstvo(StringBuilder y1, StringBuilder y2) {
            if(y1.length() == y2.length()) {
                for(int i = 0; i <y1.length(); i++) {
                    if(y1.charAt(i) != y2.charAt(i)) {
                        return false;
                    }
                }
            }else {
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");

        System.out.println(ravenstvo(sb3, sb4));
        System.out.println(Ravenstvo_SB.ravenstvo(new StringBuilder(""), new StringBuilder("")));
    }
}
