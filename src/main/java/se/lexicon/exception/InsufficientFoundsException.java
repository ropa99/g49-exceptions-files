package se.lexicon.exception;

public class InsufficientFoundsException extends Exception{
    private double balance;
    private double amount;
    private String errorCode;
    //private String message; Use parent
    private java.time.LocalDateTime;

    public InsufficientFoundsException(String message){
        this.errorCode ="12354654654564";

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
