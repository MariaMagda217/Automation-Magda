package curs;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Magda", "123", 2000);

        bankAccount.withdraw(2000);
    }
}
