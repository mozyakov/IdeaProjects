package HomeWork.Lesson13;

public class Month {
    //int x = 1;
    public static void countsDayOfMonth(int x) {  //2015 год, указать номер месяца - вывод кол-во дней в нём
        switch(x) {
            case 2:
                System.out.println("кол-во дней в месяце: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("кол-во дней в месяце: 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("кол-во дней в месяце: 31");
                break;
            default:
                System.out.println("Месяц неизвестен");
                break;
        }
    }

    public static void main(String[] args) {
        Month.countsDayOfMonth(2);  //вызов метода из класса
        countsDayOfMonth(1);  //вызов метода напрямую
        Month.countsDayOfMonth(44);  
        countsDayOfMonth(-5);
    }
}
