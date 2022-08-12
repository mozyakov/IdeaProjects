package HomeWork.Lesson15;

public class Time_only_while {
    static void time() {
        int hour = 0;
        OUTER:
        while (hour < 6) {

            int min = 0;
            MIDDLE:
            while (min < 60) {
                if (hour > 1 && min % 10 == 0) { //часть про минуты не срабатывает!
                    break OUTER;
                }

                int sec = 0;
                INNER:
                while (sec < 60) {
                    //if (sec*hour > min) {
                        //continue MIDDLE;
                    //}
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                } //граница inner
                min++;
            }  //граница middle
            hour++;
        } //граница outer
    } //граница метода
    public static void main(String[] args) {
       time();
    }
}
