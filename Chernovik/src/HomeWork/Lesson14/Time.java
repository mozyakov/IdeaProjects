package HomeWork.Lesson14;

public class Time {

    static void time() {   //показ времени в формате чч:мм:cc
        for (int hour = 0; hour < 6; hour++) {
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) { //часть про минуты не срабатывает!
                    break;
                }
                for (int sec = 0; sec < 60; sec++) {
                    if (sec*hour > min) {
                        continue;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
        System.out.println(10 % 10); //пример числа кратного десяти, должно быть 0 в остатке
        //значит в цикле должно было остановить на 1 часу 10 минуте, а он продолжил.

    }
}
