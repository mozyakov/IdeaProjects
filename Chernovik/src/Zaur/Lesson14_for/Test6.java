package Zaur.Lesson14_for;

public class Test6 {
    public void time() {   //показ времени в формате чч:мм
        OUTER:for(int hour = 0; hour <=23; hour++) {
            INNER:for(int minuta = 00; minuta <= 59; minuta++) {
                if(hour < 10 && minuta < 10) {
                System.out.println("0" + hour + ":" + 0 + minuta);
                }else if(hour < 10 && minuta > 9) {
                    System.out.println("0" + hour + ":" + minuta);
                }else if(hour > 9 && minuta < 10) {
                    System.out.println(hour + ":" + 0 + minuta);
                }else if(hour > 9 && minuta > 9){
                    System.out.println(hour + ":"  + minuta);
                }
            }
        }
    }

    public static void main(String[] args) {
    Test6 t = new Test6();
    t.time();
    }
}
