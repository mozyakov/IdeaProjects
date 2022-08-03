public class Square {  //класс описывающий структуру объектов хранящих информацию о квадратах
    public double l; //длина стороны квадрата
    public Square(double l) { //создаем конструктор
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }
}