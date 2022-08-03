public class Main {
    public static void main(String[] args) {
        System.out.println("Макс.рейтинг :" + Singer.maxRating);
        Singer singer = new Singer("Peter", 20);
        System.out.println("Макс.рейтинг :" + Singer.maxRating);
        singer.sing("Good morning!");
        System.out.println(singer.isTooYoung());
        System.out.println(singer.toString()); // метод toString выводится по-умолчанию, но мы отредактировали

        Singer singer2 = new Singer("Anya", 15, 4);
        System.out.println(singer2);
        System.out.println("Макс.рейтинг :" + Singer.maxRating);

        Album album = new Album("Весна", 2020, singer);
        System.out.println(album);
        System.out.println(singer.toGovno());
        System.out.println("ниже раздел про транспорт ======== \n");
        Transport bmw = new Transport();
        bmw.setValues(200f, 2500, "White");
        //bmw.speed = 200f;
        //bmw.weight = 2500;
        //bmw.color = "White";
        //bmw.setSpeed(270f);
        //bmw.toUpSpeed(100);
        //System.out.println("Скорость у бмв = " + bmw.speed);
        System.out.println(bmw.getValue());
        System.out.println(bmw.upSpeed(100));
        System.out.println(bmw.upSpeed(100));
        System.out.println(bmw.speed);


    }
}