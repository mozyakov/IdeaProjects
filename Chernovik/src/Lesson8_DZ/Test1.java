package Lesson8_DZ;

public class Test1 {
    String name;
    double rad;
    Test1 (String name, double rad) {
        this.name = name;
        this.rad = rad;
    }
    static final double p = 3.14;

    double areaCurcle(double rad) {
        double area = p * rad * rad;
        return area;
    }

    static double dlinaCurcle(double rad) {
        double dlina = 2 * p * rad;
        return dlina;
    }

    void showInfo(double rad) {
        System.out.println("Если у круга радиус="+rad + " Площадь круга=" + areaCurcle(rad) + " Длина окружности=" + dlinaCurcle(rad));
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
