package Zaur.Lesson16_isBlank_isEmpty_strip;
//isBlank
//isEmpty
//strip, stripLeading, stripTrailing
public class Test1 {
    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println(s1.isBlank());  //true если s1 состоит из пробелов и т.д.
        String s2 = "    ";
        System.out.println(s2.isBlank());  //true если s1 состоит из пробелов и т.д.

        String s3 = " "; //стринг не пустой, в нём есть пробел
        System.out.println(s3.isEmpty()); //false
        String s4 = "";
        System.out.println(s4.isEmpty()); //true

        String s44 = "     peivet           ";
        System.out.println(s44.strip());   //метод strip удаляет пробелы и табы вокруг строки
        //stripLeading - удалит пролбел вначале, stripTrailing - удалит в конце.
        String s5 = "poka";
        String s6 = s5.strip();  //если метод ничего не изменит, то s6 будет указывать на тот же объект
        System.out.println(s6 == s5);
    }
}
