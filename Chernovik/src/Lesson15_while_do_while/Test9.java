package Lesson15_while_do_while;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;

        do {
            int min = 0;

            while (min < 60) {
                System.out.println(hour + ":" + min);
                min++;
            }

            hour++;
        } while(hour < 24);
    }
}
