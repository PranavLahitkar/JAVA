package demo1.practice;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setAccountNumber(546777);
        b.setBalance(250000);
        System.out.println("AccountNumber : " + b.getAccountNumber() + " balance : " + b.getBalance());
    }
}
