public class Rectangle { // класс описывающий структуру объектов хранящих информацию о прямоугольниках
    public double a; // длина стороны прямоугольника
    public double b; // длина другой стороны прямоугольника
    public Rectangle(double a, double b) { //создаем конструктор
        this.a = a;
        this.b = b;
    }

    public  double area() { // считаем площадь прямоугольника
        return this.a * this.b;   //длина сторон прямоугольника
    }
}

