package Lesson16_String;

public class Test1 {


    //методя строк
    public static void main(String[] args) {

        String s1 = new String("Privet");
        String s2 = new String("abcdefabc");
        int a = s1.length();
        System.out.println(a);
        System.out.println(s1.length()); //кол-во символов

        char c1 = s1.charAt(3); //символ третьего индекса (счет начиная с нуля) строки (v)
        System.out.println(c1);

        System.out.println("Papa".indexOf("P"));  //индекс символа т в строке Papa (0)
        int i1 = s1.indexOf("t");
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);
        System.out.println("Papa".indexOf("z"));  //вызов несуществ.индекса покажет -1

        System.out.println("abcdefgabcd".indexOf("a", 5)); //показ индекс а начиная с пятой позиции

        System.out.println(s1.startsWith("abc"));  //false птмчт s1 НЕ начинается с abc
        System.out.println(s2.startsWith("abc"));  //true

    }
}
