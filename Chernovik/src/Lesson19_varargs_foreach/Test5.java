package Lesson19_varargs_foreach;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] examz = {"mat.analiz", "filosofia"};
        for(String s1: students) {
            for(String s2: examz) {
                System.out.println(s1 + " " + s2);
            }
        }



    }
}
