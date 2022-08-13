package Lesson16_all_about_String;

public class Test1 {


    //методя строк
    public static void main(String[] args) {

        String s1 = new String("Privet");
        String s2 = new String(" abcdefgabc   ");
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

        System.out.println("Privet".startsWith("abc"));  //false птмчт Privet НЕ начинается с abc
        System.out.println("abcdefgabc".startsWith("abc"));  //true
        System.out.println("abcdefgabc".startsWith("abc", 7));  //true, нач с 7 индекса
        System.out.println("Privet".endsWith("t")); //true
        System.out.println("abcdefgabc".substring(3));  //присвоить часть строки начиная с 3 индекса "defgabc"
        String s3 = s2.substring(3, 7); // с 3 до 7 индекса, но 7 не включается!
        System.out.println(s3);  //cdef
        String s12 = s2.trim();  // убирает пробелы по бокам строки, но в середине оставляет
        System.out.println(s12);
        String s14 = s1.replace("P", "r");  //Privet меняем P на r
        System.out.println(s14);
        System.out.println(s1.concat(s2)); //соединение строк
    }
}
