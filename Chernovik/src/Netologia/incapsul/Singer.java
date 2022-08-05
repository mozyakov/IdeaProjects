package Netologia.incapsul;

public class Singer extends Person{ //указ что Person родитель класса Singer
    public int rating; //добавляем параметр класса (кроме тех что он уже получил от родителя)

    public Singer(String name, int age, int rating) {
        super(name, rating); //super обращается к родителю
        this.rating = rating;
    }

    public void sing(String verse) {
        System.out.println("Я пою : " + verse);
    }

    public void printRating() {
        System.out.println(rating);
    }

    @Override    //всегда указывать, означает что хотим изменить родительский метод
    public void happyBurthday() {
        //super.happyBurthday(); //super. означает использование родительского метода
        age++;
        System.out.println("Я пою себе - С днем рождения!");
    }

    @Override
    public  String toString () { //переопределяем default метод toString
        return "[" + rating + "] " + name + " (" + age + " лет )";
    }

}
