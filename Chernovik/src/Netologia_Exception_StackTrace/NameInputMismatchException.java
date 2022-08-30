package Netologia_Exception_StackTrace;

public class NameInputMismatchException extends RuntimeException {
    public NameInputMismatchException(String text) {
        super("В параметрах надо указать фамилию и имя" + text);
    }
}
