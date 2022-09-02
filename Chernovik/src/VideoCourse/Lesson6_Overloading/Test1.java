package VideoCourse.Lesson6_Overloading;

public class Test1 {
        int sum (int a, int b, int c) {
            int result = a + b + c;
            System.out.println("Сумма трёх чисел = " + result);
            return result;
        }

        int sredneeArifm ( int a, int b, int c){
            //return (a+b+c)/3; //ниже более простой вариант, метод в методе
            return sum(a, b, c) / 3;
        }

}
class TestTest {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.sum(5, 5, 5);
    }
}
