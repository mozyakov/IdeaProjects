package Zaur.Lesson13_switch;  //догадался добавить if и switch в void методы
public class TestMethod {
}
class Stud {
    String color;
    int grade;

    Stud(String color, int grade) {
        this.color = color;
        this.grade = grade;
    }

    void getOcenki(Stud s) {
        if (s.grade == 2) {
            System.out.println("Студент двоечник");
        } else if (s.grade == 3) {
            System.out.println("Студент троечник");
        } else if (s.grade == 4) {
            System.out.println("Студент хорошист");
        } else if (s.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("оценка неизвестна");
        }
    }

    void getColor(Stud s) {
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
        Stud s1 = new Stud("black", 5);
        s1.getColor(s1);
        Stud s2 = new Stud("white", 1);
        s2.getOcenki(s2);
    }
}

