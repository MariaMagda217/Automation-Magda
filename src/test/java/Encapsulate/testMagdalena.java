package Encapsulate;

public class testMagdalena {

    public class BankAccount {

        private String owner;
        private double balance;
        private String iban;

        public BankAccount(String owner, String iban, double balance) {
            setOwner(owner);
            setIban(iban);
            setBalance(balance);
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            if (owner == null || owner.isEmpty()) {
                throw new IllegalArgumentException("Owner cannot be empty");
            }
            this.owner = owner;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            this.balance = balance;
        }

        public String getIban() {
            return iban;
        }

        public void setIban(String iban) {
            this.iban = iban;
            try {
                deposit(2);
            } catch (IllegalArgumentException e) {

            }
        }

        public void deposit(double amount) throws IllegalArgumentException {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");

            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;

            curs.BankAccount bankAccount = new curs.BankAccount("asd", "123123", 2.0);
            bankAccount.setOwner("tada");
            bankAccount.getOwner();
        }
    }

}
