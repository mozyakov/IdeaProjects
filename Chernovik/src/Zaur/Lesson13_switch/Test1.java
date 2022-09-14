package Zaur.Lesson13_switch;

class Test1 {
}
class Student {
    String color;
    int grade;
    Student(String color, int grade) {
        this.color = color;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("hohol", 3);
            if (st1.grade == 2) {
                System.out.println("Студент двоечник");
            } else if (st1.grade == 3) {
                System.out.println("Студент троечник");
            } else if (st1.grade == 4) {
                System.out.println("Студент хорошист");
            } else if (st1.grade == 5) {
                System.out.println("Студент отличник");
            } else {
                System.out.println("оценка неверна");
            }

            switch (st1.grade) {
                case 2: System.out.println("Студент двоечник"); break;
                case 3: System.out.println("Студент троечник"); break;
                case 4: System.out.println("Студент хорошист"); break;
                case 5: System.out.println("Студент отличник"); break;
                default: System.out.println("оценка неверна"); break;
            }
        switch (st1.color) {
            case "white": System.out.println("Студент белый"); break;
            case "black": System.out.println("Студент нигер"); break;
            case "coloured": System.out.println("Студент цветной"); break;
            case "aziat": System.out.println("Студент азиат"); break;
            default: System.out.println("раса неизвестна"); break;
        }
    }

}
