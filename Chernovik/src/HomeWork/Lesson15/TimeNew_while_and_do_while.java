package HomeWork.Lesson15;
public class TimeNew_while_and_do_while {
    public static void time() {   //показ времени в формате чч:мм:cc
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int min = -1;

            MIDDLE:
            do {
                min++;
                if (hour > 1 && min % 10 == 0) { //часть про минуты не срабатывает!
                    break OUTER;
                }

                int sec = 0;
                INNER:
                while (sec < 60) {
                    if (sec*hour > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                } //граница inner

            } while (min < 59); //граница middle

            hour++;
        } //граница outer
    }


    public static void main(String[] args) {
        time();
        //System.out.println(10 % 10); //пример числа кратного десяти, должно быть 0 в остатке
        //значит в цикле должно было остановить на 1 часу 10 минуте, а он продолжил до 2 часов


    }
}
