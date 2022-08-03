public class Singer {
    public static int maxRating = 0;
    public String name;
    public int age;
    public int rating;
    public Singer(String name, int age, int rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        maxRating = Math.max(maxRating, rating);
    }
    public Singer(String name, int age) {
        this(name, age,3);
        //this.name = name;
        //this.age = age;
        //this.rating = 3; // будет использоваться по умолчанию
    }
    public void sing(String verse) {
        System.out.println("Я, " + name + ", пою тебе " + verse);
    }

    public boolean isTooYoung() {
        if (age < 18) {
            System.out.println("Мне нет 18 лет");
            return true;
        } else {
            System.out.println("Мне уже 18 или больше");
            return false;
        }
    }
    public String toString() {
        return "рейтинг [" + rating + "] " + name + " (" + age + " лет)";
    }
    public String toGovno() {
        return "певец по имени " + name + " говно";
    }
}




