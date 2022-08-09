import accounts.*;   //импорт всех классов из пакета

public class Main {
    public static void main(String[] args) {

        SavingsAccount saving = new SavingsAccount();
        saving.setParameters("Сохранников", 10_000); //в одном методе несколько параметров
        saving.getBalance();
        saving.getMinBalance();
        saving.pay(5_000); //снятие true
        saving.pay(5_000); //снятие false, нельзя опускать ниже мин.баланса
        saving.add(10_000);   //пополнение true

        System.out.println("==========блок завершен==================");

        CheckingAccount check = new CheckingAccount();
        check.setParameters("Сохранников", 10_000);
        check.getBalance();
        check.getMinBalance();
        check.pay(10_000); //снятие true
        check.pay(10_000); //снятие false, нельзя уходить в минус
        check.add(20_000);   //пополнение true

        System.out.println("==========блок завершен==================");

        CreditAccount cred = new CreditAccount();
        cred.setParameters("Кредитников", 200_000); //как бы баланс в плюс, но
        //setter этого класса при создании всё равно обнулит баланс!!!
        cred.getBalance();  //setter класса сработал, баланс 0
        cred.pay(50_000); //снятие true, на этом счете снятие всегда будет true, минус не страшен
        cred.add(40_000); //пополнение true, потому что баланс пока в минусе
        cred.add(20_000); //пополнение false, иначе баланс станет положительным
    }
}