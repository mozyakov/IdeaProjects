public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lord", "Thomas Mann", 1950);
        System.out.println(book1);
        book1.up();
        book1.up();
        System.out.println(book1); //максимальный рейтинг 5
        book1.up(); //рейтинг не повысится - предел в 5 достигнут
        System.out.println(book1);

        book1.append("la-la-la"); //метод добавления текста в конец книги
        System.out.println(book1);

        book1.down();  //снижаем рейтинг
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        book1.down();
        System.out.println(book1); // ниже нуля рейтинг не понизится
    }
}