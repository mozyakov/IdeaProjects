package Lesson15_while_do_while;

public class Test6 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i <= 10 );

        int money = 0;
        do {                 //цикл всегда сработает хотя бы один раз
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
            System.out.println("на вашем счету " + money);
        }
        while(money >=10);




    }
}
