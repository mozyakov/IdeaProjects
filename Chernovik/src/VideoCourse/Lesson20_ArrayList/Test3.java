package VideoCourse.Lesson20_ArrayList;
import java.util.ArrayList;
public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("ok1");
        StringBuilder sb2 = new StringBuilder("ok1");
        StringBuilder sb3 = new StringBuilder("ok1");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for(int i = 0; i < list.size(); i++) {
            list.get(i).append("!");
        }

        for (StringBuilder sb:list) {
            System.out.print(sb + " ");
        }


    }
}

