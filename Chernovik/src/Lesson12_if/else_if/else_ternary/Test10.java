package Lesson12_if.else_if.else_ternary;

public class Test10 {
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = true;
        if(salary < 200) {
            System.out.println("ЗП очень низкая");
        }else if(salary < 400) {
            System.out.println("ЗП средняя");
        }else if(salary < 600) {
            System.out.println("ЗП высокая");
        }else {
            System.out.println("ЗП очень высокая");
        }
    }
}
