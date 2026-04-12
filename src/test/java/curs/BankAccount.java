package curs;

public class BankAccount {
    private String owner;
    private double balance;
    private String iban;

    private BankAccount() {
    }

    public BankAccount(String owner, String iban, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.iban = iban;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            System.out.println("Balance after deposit is " + this.balance + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            System.out.println("Cannot withdraw negative or zero amount");
        }

        if (amount > balance) {
            System.out.println("Not enough money");
            return;
        }

        balance = balance - amount;
        balance -= amount;
        System.out.println("Balance after withdrawal is " + balance);
    }
}

