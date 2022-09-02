package VideoCourse.else_ternary;

public class Test10 {
    void maximum(int i1, int i2, int i3) {
        if(i1 > i2 && i1 > i3) {
            System.out.println("Maximum - " + i1);
        }else if(i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        }else{
            System.out.println("Maximum - " + i3);
        }
    }
    void abc(int a) {
        String str;
        //int a = 10;
        if(a >= 10) {
            str = "Privet";
            System.out.println(str);
        }if(a < 10) {
            str = "Bye";
            System.out.println(str);
        }else {str = "xxxyyyzzz";
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = true;
        if(salary < 200) {
            System.out.println("ЗП очень низкая");
        }else if(salary < 400 && b == false || !true) {
            System.out.println("ЗП средняя");
        }else if(salary < 600) {
            System.out.println("ЗП высокая");
        }else {
            System.out.println("ЗП очень высокая");
        }
        //int a = 10;
        int aa = 10;
        int bb = 20;
        int maximum = aa > bb ? aa : bb; //тенрарный оператор
        System.out.println("результат работы тенрарного оператора " + maximum);

        Test10 t = new Test10();
        t.maximum(4, 7, 0);
        t.abc(10);


    }
}
