package HomeWork.Lesson14;

public class Time {
    public void time() {   //показ времени в формате чч:мм
        for(int hour = 0; hour <=23; hour++) {
            for(int min = 00; min <= 59; min++) {
                if(hour > 1 && min%10 == 0) {
                    break;
                }
                for(int sec = 00; sec <= 59; sec++)
                    if(hour < 6) {
                        System.out.println(hour + ":" + min + ":" + sec);
                    }
            }
        }
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.time();
    }


}
