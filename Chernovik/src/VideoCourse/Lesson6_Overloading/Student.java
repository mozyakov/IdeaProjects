package VideoCourse.Lesson6_Overloading;

public class Student {
    int studentId; //блок параметров класса
    String name;
    String lastName;
    int course;
    double mathAverage; // средние оценки по предметам
    double economicAverage;
    double averageForeignLang;

    Student(int studentId, String name, String lastName, int course, double mathAverage, double economicAverage, double averageForeignLang) {
        this.studentId = studentId; //первый конструктор самый подробный, но при использовании для создания объекта будет мало писанины
        this.name = name;           //всё через параметры, без объявления переменных
        this.lastName = lastName;
        this.course = course;
        this.mathAverage = mathAverage;
        this.economicAverage = economicAverage;
        this.averageForeignLang = averageForeignLang;
        /*studentId = studentId1; //первый конструктор самый подробный, но при использовании для создания объекта будет мало писанины
        name = name1;           //всё через параметры, без объявления переменных
        lastName = lastName1;
        course = course1;
        mathAverage = mathAverage1;
        economicAverage = economicAverage1;
        averageForeignLang = averageForeignLang1;
         */
    }

    Student(int studentId2, String name2, String lastName2, int course2) { //конструктор с тремя параметрами, остальные через объявления переменных
        this(studentId2, name2, lastName2, course2, 0, 0, 0);
    }

    Student() { //третий конструктор пустой, при его использовании будет много писанины при создании объекта
                //потребуется объявлять все переменные и значения
    }


}

class StudentTest {
    public static void main(String[] args) {

        Student man1 = new Student(11, "Petr", "Petrov",4, 4.9, 5.0, 5.0);
        //это первый конструктор, всё передаётся через параметры, переменные не нужны!

        Student man2 = new Student(13, "Ivan", "Ivanov", 3);
        man2.mathAverage = 4.5; //это второй конструктор поэтому передаем переменным только три значения, остальное уже есть в параметрах выше
        man2.economicAverage = 4.4;
        man2.averageForeignLang = 4.4;

        Student man3 = new Student(); //используется третий конструктор, поэтому столько писанины
        man3.studentId = 33;          //передаются значения всем переменным
        man3.name = "Tomas";
        man3.lastName = "Tomasov";
        man3.course = 3;
        man3.mathAverage = 3.1;
        man3.economicAverage = 2.7;
        man3.averageForeignLang = 2.4;

        System.out.println(man1.name);
        System.out.println(man2.name);
        System.out.println(man3.name);

    }
}
