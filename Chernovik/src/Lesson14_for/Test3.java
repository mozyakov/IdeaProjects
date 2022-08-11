package Lesson14_for;

public class Test3 {
    public static void main(String[] args) { //вывод только четных чисел
        for(int i = 2; i %2 == 0 && i < 31; i += 2) {  //мой вариант
            System.out.println(i);
        }

        System.out.println();

        for(int i = 2;  i <= 30; i += 2) {  //вариант лектора
            System.out.println(i);
        }
    }
}
