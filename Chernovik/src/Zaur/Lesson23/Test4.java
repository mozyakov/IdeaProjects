package Zaur.Lesson23;

public class Test4 {
    void abc(Animal a) {
        System.out.println("A");
    }
    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();
        t.abc(an); //покажет А-переменная проверяется compile, не смотрит на new Mouse
        an.getName(); //покажет M-в методе проверка runtime смотрит до конца


    }

}



class Animal{
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    @Override
    void getName() {
        System.out.println("Mouse");
    }
}

