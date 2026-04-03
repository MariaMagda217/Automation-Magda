package Tema7;

// 2. Creează clasa BankAccount:
//  Atribute:
// • ownerName
//• balance
//    Metode:
// • deposit(double amount)
// • withdraw(double amount)
// • displayBalance()
//    Reguli:
// • nu permite retragere dacă balance < amount
//   În main:
// • creează un cont
// • fă 2 depuneri și 1 retragere

public class BankAccount {
    private final String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Pixie", 100);

        account.Deposit(50);
        account.Deposit(200);
        account.Withdraw(120);

        account.displayBalance();
    }

    public void Deposit(double amount) {
        balance += amount;
        System.out.println(ownerName + " Deposited " + amount + " current balance " + balance);
    }

    public void Withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds for withdrawal " + amount);
        } else {
            balance -= amount;
            System.out.println(" Withdrew " + ownerName + " current balance: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Current balance " + ownerName + " is " + balance);
    }
}
