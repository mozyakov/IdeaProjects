package HomeWork.Lesson9;
/* напишите программу в которой будет создано 8 объектов, но к концу метода main останется только 2

 */
public class Lesson9 {

    public static void abc() {
        String s1 = "ABC";
        String s2 = "DEF";
    }

    public static void main(String[] args) {
        abc(); //после вызова метода вложенные в него объекты "умрут"
        abc(); //потому что они живут лишь в пределах своих методов
        abc();
        Lesson9 tank1 = new Lesson9(); //
        Lesson9 tank2 = new Lesson9();

    }


}
