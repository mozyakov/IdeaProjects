package Lesson8_DZ;

public class Test1 {
    String name;
    double rad;
    Test1 (String name, double rad) { //конструктор класса с двумя параметрами
        this.name = name;
        this.rad = rad;
    }
    static final double p = 3.14;

    double areaCurcle(double rad) { //метод возвращающий площадь круга
        double area = p * rad * rad;
        return area;
    }

    static double dlinaCurcle(double rad) { //метод возвращающий длину окружности
        double dlina = 2 * p * rad;
        return dlina;
    }

    void showInfo(double rad) { //выводит инфу о радиусе, площади круга и длине окружности
        System.out.println("Если у круга радиус="+rad + ", то площадь круга=" + areaCurcle(rad) + ", длина окружности=" + dlinaCurcle(rad));
    }
}

class Test2 {
    public static void main(String[] args) {
        Test1 c1 = new Test1("Krug", 8);
        System.out.println("Площадь круга "+c1.name+" с радиусом "+c1.rad+" равна "+c1.areaCurcle(c1.rad));
        System.out.println("Длина окружности круга "+c1.name+" с радиусом "+c1.rad+" равна "+c1.dlinaCurcle(c1.rad));
        c1.showInfo(c1.rad);


    }
}
