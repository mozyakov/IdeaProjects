import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String maxName = null;
        Scanner scan = new Scanner(System.in);
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Vvedite imya s bolshoi bykvy ili najmite end: ");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                System.out.println("Programma zavershena!");
                break;
            }
            char symbol = input.charAt(0);
            if (Character.isLowerCase(symbol)) {
                System.out.println("Vy napisali imya ne s bolshoi bykvy: ");
                continue;
            }
            if (maxName == null) {
                System.out.println("Eto pervoe vvedennoe imya!");
                maxName = input;
            } else if (input.length() < maxName.length()) {
                System.out.println("Samoe dlinnoe vvedennoe imya: " + maxName);
                int raznisa = maxName.length() - input.length();
                System.out.println("Vashe imya koroche na " + raznisa + " simvolov");
            } else if (input.length() > maxName.length()) {
                maxName = input;
                System.out.println("Teper vashe imya samoe dlinnoe! " + maxName);
            }
        }
    }
}






