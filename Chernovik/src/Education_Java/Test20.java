package Education_Java;

public class Test20 {
    int summa(int a, int b, int c) { //это input
        int result = a + b + c;   //это операция метода
        return result;    //это output
    }

    int sredneeArif(int a1, int b1, int c1) { // метод в методе
        int result1 = summa(a1, b1, c1) / 3;   //вызываем метод сумма и делим на три
        return result1;
    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20(); //создаю обьект класса, потому что метод оттуда
        int summaTrehChisel = t.summa(1, 2, 3); //присвоил в родной метод чужой метод из класса Test20
        System.out.println(summaTrehChisel); // и вывел его результат

        System.out.println(t.summa(5, 10, 10)); // а тут сразу вывел чужой метод

        System.out.println(t.sredneeArif(10, 10, 10)); // метод summa в методе sredneeArif

    }
}


