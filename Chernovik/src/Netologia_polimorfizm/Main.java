package Netologia_polimorfizm;

public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer("Tanya", 15, 4);
        if(checkPerson(singer));

    }

    public static boolean checkPerson(Person person) {
        if(person.getAge() < 18) {
            return false;
        }else {
            return true;
        }
        //return person.getAge() >= 18; // можно было так в одну строку
    }
}
