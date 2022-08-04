package Lesson4_Creation_class_Student;

public class Student {
    int studentId;
    String name;
    String lastName;
    int course;
    double mathAverage; // средние оценки по предметам
    double economicAverage;
    double averageForeignLang;
}

class StudentTest {
    double sredArifmOcenka(Student st) { // внимание на st в самом низу появится
        double sredOcenka = (st.mathAverage + st.economicAverage + st.averageForeignLang) / 3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " " + st.lastName + ": " + sredOcenka );
        return sredOcenka;
    }
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 34566;
        st1.name = "Peter";
        st1.lastName = "Robini";
        st1.course = 2019;
        st1.mathAverage = 5.4;
        st1.economicAverage = 3.4;
        st1.averageForeignLang = 3.2;

        Student st2 = new Student();
        st2.studentId = 34576;
        st2.name = "Bred";
        st2.lastName = "Ramernet";
        st2.course = 2019;
        st2.mathAverage = 5.0;
        st2.economicAverage = 5.0;
        st2.averageForeignLang = 5.0;

        System.out.println("Средняя оценка студента "+st1.name+" "+st1.lastName+" = "+(st1.mathAverage+st1.economicAverage+st1.averageForeignLang)/3);
        System.out.println("Средняя оценка студента "+st2.name+" "+st2.lastName+" = "+(st2.mathAverage+st2.economicAverage+st2.averageForeignLang)/3);

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
    }

}
