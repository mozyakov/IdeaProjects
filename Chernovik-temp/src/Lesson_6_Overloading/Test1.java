package Lesson_6_Overloading;

public class Test1 {
    int sum(int a, int b, int c) {
        return a+b+c;
    }

    int sredneeArifm(int a, int b, int c) {
        //return (a+b+c)/3; //ниже более простой вариант, метод в методе
        return sum(a,b,c)/3;
    }
}
