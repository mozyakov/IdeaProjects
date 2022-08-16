public class Book { //создали класс и объявили его параметры
    public String title;
    public String author;
    public int yearCreation;
    public int rating = 3; //параметр по-умолчанию
    public String text;

    public Book(String title, String author, int yearCreation) {//конструктор класса, перечислены не все параметры
        this.title = title; //у одного класса м.б. разные конструкторы с разным кол-вом параметров
        this.author = author;
        this.yearCreation = yearCreation;
    }

    public String toString() { //выводим инфу о книге
        return "Название: " + title + "\n" + "автор: " + author + "\n" + "написана: " + yearCreation + "\n" + "рейтинг: " + rating + "\n" + "содержание: " + text + "\n=========" + "\n=========" + "\n=========";
    }

    public void up() { //метод поднятия рейтинга
        if (rating < 5) {
            rating++;
        }
    }

    public void down() { //метод снижения рейтинга
        if (rating > 0) {
            rating--;
        }
    }

    public void append(String moreText) { //метод добавления текста
        text += moreText;
    }

}
