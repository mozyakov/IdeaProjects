package Zaur.Lesson13_switch;

import static HomeWork.Lesson13.Month.*;

public class Employee {

    public static void main(String[] args) {
        switch ("Понедельник") {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Работы нет");
                break;
            default:
                System.out.println("День неизвестен");
                break;
        }

        countsDayOfMonth(5); //импортированный метод

    }
}
