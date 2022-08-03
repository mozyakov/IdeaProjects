import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr2 = {5, 3, 15, 100, 1};   //быстрое создание массива
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Petr", "Ira", "Lena"}; //массив может состоять из строк
        Singer[] arr4 = { //массив из класса
                new Singer("Petya", 8),
                new Singer("Tanya", 15)
                };
        String[] names = {"Peta", "Ola", "Ana", "Pavel", "Oleg"}; //создан массив
        for (int i = 0; i < names.length; i++) { // исп.если нужен номер элемента
            if (!names[i].startsWith("P")) { //вывести элементы не начинающиеся с P
                System.out.println(names[i]);
                }
            }
        for (String name : names) { //(ячейка совпад.типа : по чему пройтись циклом) исп.если номер не нужен
            if (!name.startsWith("P")) {
                System.out.println(name);
            }
        }
        Arrays.sort(names);  //метод сортировки
        System.out.println(Arrays.toString(names));
        String[] names2 = names.clone(); //метод клонирования
        names2[0] = null; //меняем значение первой ячейки массива
        System.out.println(Arrays.toString(names));  //без изменений, потому что это другой массив
        System.out.println(Arrays.toString(names2)); //изменилась первая ячейка

    }
}