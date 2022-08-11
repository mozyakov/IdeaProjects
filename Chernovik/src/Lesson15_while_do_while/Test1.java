package Lesson15_while_do_while;

public class Test1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <=100) {
            if(i % 10 ==  0) { //вывод только кратных десяти
            System.out.println(i);
            }
            i++;
        }

        int x = 1;
        while(x <=10) {
            if(x % 2 == 0) { //вывод только кратных десяти
                System.out.println(x);
            }
            x++;
        }
    }
}
