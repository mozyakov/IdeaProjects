package Netologia_Exception_StackTrace;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(sameLength("Petrov petyaa"));
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static boolean sameLength(String text) { //Petrov Petya
        String[] parts = text.split(" ");   //["Petrov", "Petya"]
        if(parts.length != 2) {
            throw new NameInputMismatchException(text);
        }
        String name = parts[1];
        String lastName = parts[0];
        return name.length() == lastName.length();
    }
}


