import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[] agentX = new int[2]; //неизвестные координаты агента

        for (int[] cell : agents) {
            agentX = cell; //получены координаты агента
            int x = agentX[0];
            int y = agentX[1];
            if (field[x][y] == 0) {   //заглянуть в ячейку поля с извлеч.координатами
                field[x][y] += 1;     //и если там 0, то записать 1
            } else {
                field[x][y] *= 2;   //а если не 0, то умножить на 2
            }
            //System.out.println(Arrays.deepToString(field)); // прогресс заражения
        }
        //System.out.println(Arrays.deepToString(field)); //ниже план второго метода для вывода результатов

       for (int i = 0; i < field.length; i++) {  //цикл для красивого вывода итоговой таблицы
           for (int j = 0; j < field[i].length; j++) {
               System.out.print(field[i][j] + "\t");
           }
           System.out.println();
       }





    }
}



