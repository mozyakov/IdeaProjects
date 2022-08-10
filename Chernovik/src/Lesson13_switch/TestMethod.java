package Lesson13_switch;  //догадался добавить if и switch в void методы
public class TestMethod {
}
class Student5 {
    String color;
    int grade;

    Student5(String color, int grade) {
        this.color = color;
        this.grade = grade;
    }

    void doIf(Student5 s) {
        if (s.grade == 2) {
            System.out.println("Студент двоечник");
        } else if (s.grade == 3) {
            System.out.println("Студент троечник");
        } else if (s.grade == 4) {
            System.out.println("Студент хорошист");
        } else if (s.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("оценка неверна");
        }
    }

    void doSwitch(Student5 s) {
        switch (s.color) {  //switch можно использовать с разными типами
            case "white":
                System.out.println("Студент белый");
                break;
            case "black":
                System.out.println("Студент нигер");
                break;
            case "coloured":
                System.out.println("Студент цветной");
                break;
            default:
                System.out.println("раса неизвестна");
                break;
        }
    }

    public static void main(String[] args) {
        Student5 saa = new Student5("black", 5);
        saa.doSwitch(saa);
        Student5 st1 = new Student5("white", 3);
        st1.doIf(st1);

        /*switch (st1.color) { //выше добавил switсh в метод doSwitch
            case "white":
                System.out.println("Студент белый");
                break;
            case "black":
                System.out.println("Студент нигер");
                break;
            case "coloured":
                System.out.println("Студент цветной");
                break;
            case "yellow":
                System.out.println("Студент азиат");
                break;
            default:
                System.out.println("раса неизвестна");
                break;
        }*/

        /*if (st2.grade == 2) { //выше добавил if в метод doIf
            System.out.println("Студент двоечник");
        } else if (st2.grade == 3) {
            System.out.println("Студент троечник");
        } else if (st2.grade == 4) {
            System.out.println("Студент хорошист");
        } else if (st2.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("оценка неверна");
        }*/
    }
}

