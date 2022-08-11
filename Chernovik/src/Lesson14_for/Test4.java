package Lesson14_for;

public class Test4 {
    public static void main(String[] args) {
        int a = 15;

        if(a > 10) {
            for(int i = 1; i <=10; i++) { //показ только четных
                if(i%2 != 0) {      //нечетные пропускает
                    continue;
                }
                System.out.println(i);
            }
        }



    }
}
