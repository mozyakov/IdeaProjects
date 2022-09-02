package VideoCourse.Lesson20_ArrayList;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("ok1");
        list.add("ok2");
        list.add("ok3");

        for (String s:list) {
            System.out.print(s + ", ");
        }
        System.out.println("\n");
        list.add(0, "hello"); //указываю индекс куда добавить, не превышать кол-во индексов!
        for (String s:list) {
            System.out.print(s + ", ");
        }




    }
}
