package HomeWork.Lesson14;

public class Time {

    static void time() {   //показ времени в формате чч:мм:cc
        OUTER:for (int hour = 0; hour < 6; hour++) {
            MIDDLE:for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) { //часть про минуты не срабатывает!
                    System.out.println(hour + ":" + min);
                    break OUTER;
                }
                INNER:for (int sec = 0; sec < 60; sec++) {
                    if (sec*hour > min) {
                        //System.out.println(hour + ":" + min + ":" + sec);
                        continue;
                    }
                    //System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
        //System.out.println(10 % 10); //пример числа кратного десяти, должно быть 0 в остатке
        //значит в цикле должно было остановить на 1 часу 10 минуте, а он продолжил до 2 часов

    }
}
