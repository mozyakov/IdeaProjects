package VideoCourse.Lesson15_while_do_while;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do {
            int min = 0;

            INNER:
            while (min < 60) {
                if(min == 20) {
                    //break; //завершаем while, то же самое break INNER;
                    break OUTER; //завершаем внешний(OUTER)

                }
                System.out.println(hour + ":" + min);
                min++;
            }

            hour++;
        } while(hour < 24);
    }
}
