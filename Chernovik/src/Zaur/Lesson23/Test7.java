package Zaur.Lesson23;

public class Test7 {
    public static void main(String[] args) {
        AA c1 = new CC();
        c1.abc(new BB());

    }
}
class AA{
    void abc(AA a) {
        System.out.println("A");
    }
}

class BB extends AA {
    void abc(BB b1) {
        System.out.println("B");
    }
}

class CC extends BB {
    @Override
    void abc(BB b2) {
        System.out.println("C");
    }
};