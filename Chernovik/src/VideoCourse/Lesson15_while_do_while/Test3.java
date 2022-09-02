package VideoCourse.Lesson15_while_do_while;

public class Test3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while(b) {
            System.out.println(a);
            if (a %3 == 0 && a %7 == 0) {
                //b = false;
                break;
            }
            a++;
        }
    }
}
