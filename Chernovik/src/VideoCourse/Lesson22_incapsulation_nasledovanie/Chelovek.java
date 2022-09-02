package VideoCourse.Lesson22_incapsulation_nasledovanie;

public class Chelovek {
    final String pol;
    public Chelovek(String pol) {
        this.pol = pol;
    }
    private boolean clever;
    public boolean isClever() {
       return clever;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if(i > 0) {
            age = i;
        }
    }
    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int i) {
        if(i > 0) {
            weight = i;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setWeight(50);
        c.setAge(15);
        System.out.println("имя " + c.getName());
        System.out.println("возраст" + c.getAge());
        System.out.println("вес" + c.getWeight());
        c.setWeight(-100);   //не сработает из-за условий в сеттере
        System.out.println("вес" + c.getWeight());


    }
}
