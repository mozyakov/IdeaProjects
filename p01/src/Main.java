import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        Scanner scan = new Scanner(System.in);
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Для выбора операции введите её номер\n добавить доход-ввести 1\n добавить расход-ввести 2\n выбрать систему налогообложения-ввести 3\n закончить работу-ввести end\n После ввода нажимайте Enter: ");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }
            //видимо здесь писать продолжение
            switch (input) {
                case "1":
                    System.out.println("Введите доходы:");
                    String moneyEarnings = scan.nextLine(); // Не используйте тут nextInt (!)
                    int money = Integer.parseInt(moneyEarnings);
                    earnings += money;
                    System.out.println("Общий доход " + earnings + " рублей");
                    break;
                case "2":
                    // действия при выборе второй операции
                    System.out.println("Введите расходы:");
                    String moneySpendings = scan.nextLine(); // Не используйте тут nextInt (!)
                    int money2 = Integer.parseInt(moneySpendings);
                    spendings += money2;
                    System.out.println("Общий расход " + spendings + " рублей");
                    break;
                case "3":
                    int calcTaxEarnins = taxFromEarnings(earnings);
                    int calcTaxMinus = taxEarningsMinusSpendings(earnings, spendings);
                    if (calcTaxEarnins < calcTaxMinus) {
                        System.out.println("выбрана УСН доходы: \n" + "Ваш налог: " + calcTaxEarnins + " рублей");
                        System.out.println("Налог на другой системе: " + calcTaxMinus + " рублей");
                        System.out.println("Экономия: " + (calcTaxMinus - calcTaxEarnins) + " рублей");
                    } else if (calcTaxEarnins > calcTaxMinus) {
                        System.out.println("выбрана УСН доходы минус расходы: " + "налог: " + calcTaxMinus + " рублей");
                        System.out.println("Налог на другой системе: " + calcTaxEarnins + " рублей");
                        System.out.println("Экономия: " + (calcTaxEarnins - calcTaxMinus) + " рублей");
                    }
                    break;


            }
            //System.out.println("брейк в цикле while");
        }
        System.out.println("Программа завершена");
        //System.out.println("налог по системе УСН доходы :" + taxFromEarnings(earnings));
        //System.out.println("налог по системе УСН доходы-расходы :" + taxEarningsMinusSpendings(earnings, spendings));

    }     //УСН доходы - налог 6% от доходов;

    static int taxFromEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else { // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }     //УСН доходы минус расходы - налог 15% от разницы доходов и расходов

    static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else { // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}



/* версия от 6 июля 8:12
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        Scanner scan = new Scanner(System.in);
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Ввести доходы-нажать 1, ввести расходы-2, выбрать систему налогообложения-3, закончить работу-набрать end, после каждого ввода нажимайте Enter: ");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }

        }System.out.println("Программа завершена");
        //System.out.println(taxEarningsMinusSpendings(1000, 2000));
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваши доходы и нажмите Enter: ");
        String moneyStr1 = scan.nextLine(); // Не используйте тут nextInt (!)
        int money1 = Integer.parseInt(moneyStr1);
        earnings += money1;

        System.out.println("Введите ваши расходы и нажмите Enter: ");
        String moneyStr2 = scan.nextLine(); // Не используйте тут nextInt (!)
        int money2 = Integer.parseInt(moneyStr2);
        spendings += money2;
        System.out.println("Ваши доходы: " + earnings);
        System.out.println("Ваши расходы: " + spendings);

    }
//УСН доходы - налог 6% от доходов;
public static int taxFromEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
        return tax;
        } else { // если расходы оказались больше, то налог посчитается отрицательным
        return 0;
        }
        }
//УСН доходы минус расходы - налог 15% от разницы доходов и расходов
public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
        return tax;
        } else { // если расходы оказались больше, то налог посчитается отрицательным
        return 0;
        }
        }
        }
 */


/*import my.fav.code.A;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean b = 9 < 8;
        System.out.println(b);
        System.out.println("x = " + A.x);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год в формате уууу и нажмите Enter: ");
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println("Кол-во дней 366");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Кол-во дней 366");
        } else {
            System.out.println("Кол-во дней 365");
        }
    }
}
 */

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int a = 0; a <= 10; a ++) {
            //указать переменные
            //условие выполнения цикла
            //какие будут изменения переменной
            System.out.println("Element a = " + a);
        }
        System.out.println("----------");

        int b = 5; // в скобках после while тольк условие выполнения цикла
        while (b < 25) {
            b += 5;
            System.out.println("Element b = " + b);
        }
        System.out.println("----------");

        int c = 100;
        do {
            c *= 100;
        }while (c < 10);
        System.out.println("Element c = " + c);
 */

    /* //условные конструкции switch-case case работают только с конкретными значениями
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt(); // можно проверять разные типы булевы, строковые, символьные, флоат,
        switch (number)
        {
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
                System.out.println("Number = 2");
                break;
            default:   //аналог else
                System.out.println("Это не 1 и не 2");
        }

        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = console.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = console.nextInt();
        int res;
        System.out.print("Действие: ");
        //String action = console.next();  // последняя строка ввода во избежании ошибки невидимого символа
        String action = console.nextLine();
        action = console.nextLine();
        switch (action)
        {
            case "+":
                res = num1 + num2;
                System.out.print("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.print("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.print("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.print("На ноль делить нельзя");
                else {
                    res = num1 / num2;
                    System.out.print("Результат: " + res);
                }
                break;
            default:
                System.out.print("Что-то не так");
        }


         */

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите роль: Admin, Moderator, User, Guest");
        String role = scan.nextLine();  //ссылочный тип данных сравнивается методом equals("Значение")
        if (role.equals("Admin")) {    //ссылочный тип данных сравнивается методом equals("Значение")
            System.out.print ("Admin - может всё");
        }
        else if (role.equals("Moderator")) {
            System.out.print("Moderator правит свои и чужие статьи");
        }
        else if (role.equals("User")) {
            System.out.print("User правит только свои статьи");
        }
        else if (role.equals("Guest")) {
            System.out.print("Guest доступ только на чтение");
        }
        else {
            System.out.print("Вы ввели то, что не представлено в меню");
        }
    }
}
*/

/*import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int payment = calcPayment(2600000, 200000, 2);
            System.out.println("Ежемячный платёж составит: " + payment);
        }

        //int start первоначальный взнос
        //int amount общая сумма покупки с первоначальным взносом
        //int years кол-во лет, для получения месяцев умножить на 12
        public static int calcPayment(int amount, int start, int years) {
            int sum = (amount - start) / (years * 12);
            return sum;
        }
}
 */
/*
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите роль: Admin, Moderator, User, Guest");
    String role = scan.nextLine();
    if (role.equals("Admin")) {
      System.out.print ("Admin - может всё");
    }
    else if (role.equals("Moderator")) {
      System.out.print("Moderator только правит статьи, свои и чужие");
    }
    else if (role.equals("User")) {
      System.out.print("User правит только свои статьи");
    }
    else if (role.equals("Guest")) {
      System.out.print("Guest доступ только на чтение");
    }
    else {
      System.out.print("Вы ввели то, что не представлено в меню");
    }
  }
}
 */

/*class Main {
  public static void main(String[] args) {
    System.out.println("Sergey Mozyakov");
    String name = "Sergey";
    String surname = "Mozyakov";
    int  income = 1000;
    int spending = 900;
    int surplus = income - spending;
    /* После объявления этих трёх заполненных переменных вам надо одной командой System.out.println вывести составное сообщение вида:
Voronov Filipp, surplus: -13540 руб
где месячный остаток (surplus) это разница между доходами и расходами. */
/*System.out.print(name + " " + surname + " " + "месячный остаток: " + surplus + "руб");

 */


/*         Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число и нажмите Enter");
        int a = console.nextInt();
        System.out.println("Введите целое число и нажмите Enter");
        int b = console.nextInt();
        if (a > b) {
            System.out.println("Первое число больше второго");
        }
        else if (a < b) {
            System.out.println("Первое число меньше второго");
        }
        else if(a == b) {
            System.out.println("Первое число равно второму");
        }
        int x = 0;  // ниже тернарный оператор
        int yy = (x > 0) ? 1: -1;  //переменная = (условие) ? первоезначение: второезначение;
        System.out.println(yy);
        //else {} //в else не должно быть никаких условий, только действие в фигурных скобках10, если действия нет, то else не нужен

*/
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String username = scan.nextLine(); //ожидаем что будет тип данных строка метод nextLine()
        System.out.println("Привет, " + username);
        System.out.println("Количество символов в вашем имени " + username.length());

        /*System.out.println("Введите число и на новой строке будет ваше число + 1");
        int num1 = scan.nextInt();   //тип переменная и ожидаем тип данных число метод nextInt()
        \\если строка то String переменная = scan.nextLine();
        System.out.println("Вот ваше число с увеличением на один: " + (num1 + 1));
         */
        /*String militaryCommissar = ", явитесь в военкомат";
                //напишите тут ваш код
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Как вас звать?");
                String name = scan1.nextLine();
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Введите цифрами ваш возраст");
                int age = scan2.nextInt();
                if (age >= 18 && age <= 28)
                    System.out.print(name + militaryCommissar);
                else;
                */


/*import java.util.Scanner;
//Тепло или холодно
public class Main {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        //String title = scanner.nextLine();
        int temperature = scanner.nextInt();
        if (temperature < 0)
            System.out.println(cold);
        else
            System.out.println(warm);
        System.out.print("Hello\n2str\n3str\n4str\n5str\n");
        byte b = 5;
        short s = 300;
        System.out.println(b + s);

 */

/*public class Main {
    public static void main(String[] args) {
        int age =60;
        if (age < 18)
            System.out.print("Вы ешё ребёнок");
        else if (age > 17 && age < 60)
            System.out.print("В самый раз");
        else
            System.out.print("Всё, пора на пенсию");
    }
}
*/

/*import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            int byteIn = System.in.read();
            System.out.println(byteIn);
        }
    }
}
*/

/*import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        char x = 1071;   //эти цифры это код ббольшоя буквы Я
        System.out.println(x);
    }
}
*/

/*public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        while (true) {
            int x = reader.read();
            System.out.println(x);
        }
    }
}
*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner("На голой ветке'"  +
            "Ворон сидит одиноко.'"  +
            "Осенний вечер."  +
            "''***''" +
            "В небе такая луна,'"  +
            "Словно дерево спилено под корень:'" +
            "Белеет свежий срез." +
            "''***''" +
            "Как разлилась река!'" +
            "Цапля бредёт на коротких ножках,'" +
            "По колено в воде.'");
        scan.useDelimiter("'");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
*/

/*Scanner sc = new Scanner(System.in);
        System.out.print("Введите число и нажмите клавишу Enter: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо, Вы ввели число " + number);
        } else {
                System.out.println("То что Вы ввели не является числом.");
                sc.close();
        }
*/

/*         Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
               "Люблю твой строгий, стройный вид,\n" +
               "Невы державное теченье,\n" +
               "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
 */

/*        String str = "10 20 40 60";
        Scanner scanner = new Scanner (str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print (a + b);
 */

/*      Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        String str2 = console.nextLine();
        String str3 = console.nextLine();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
 */

/*      Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        System.out.println((a + b + c) / 3);
        //ниже еще вариант
        //Scanner n = new Scanner(System.in);
        //int a = n.nextInt(), b = n.nextInt(), c = n.nextInt();
        //String str = n.nextLine();
        //System.out.print(str + (a + b + c) / 3);
        //n.close();
 */

/* public class Main {
    public static void main(String[] args) {
        int i = 2, j = 45;
        if (i == 3 || j == 45); {
            System.out.print("Srabotalo odno iz uslovii");
            }
        }
}
*/

 /*     int i = 234;
        if (i != 300) {
            System.out.print("i = 234, eto ne 300");
        }


        /*String x = "JAVARush";
        String y = "Amigo";
        String name = (x+y+"ROME123").toLowerCase();
*/

/*      String z = "11";
        int a = 10;
        int b = Integer.parseInt(z)+ 10;
        String c = "22";
        String ze = "44";
        //System.out.print((a+z)+c.length());
        int cee = a + b;
        cee -= 1;
        System.out.print(cee);
*/

/*  //System.out.println((c+ z).length());
        //System.out.println(b);
        // System.out.println(c);
*/

