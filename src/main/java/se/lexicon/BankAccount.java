package se.lexicon;

public class BankAccount {
    private static int nextAccountNumber = 1000; // Starting account number
    private final int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        // todo: needs completion
        if(amount < 0 ) throw new IllegalArgumentException("Amount cant be zero");
        balance += amount;
        System.out.println("New Money "+  balance);
    }

    public void withdraw(double amount) {
        // todo: needs completion
        if(amount <0) throw new IllegalArgumentException("FELFEL");

        if(amount > balance) throw new se.lexicon.exception.InsufficientFoundsException("FEl2 FEl2");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}