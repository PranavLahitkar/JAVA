//You are tasked with designing a simple banking system that supports different types of accounts such as savings account and current //account. Both types of accounts have a common functionality of depositing and withdrawing money, but they calculate interest //differently. Savings accounts accrue interest based on a fixed rate, while current accounts do not accrue any interest. Implement a Java //program using polymorphism to demonstrate the functionality of these different account types.
//combining all classfiles in one file
// Account.java
public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void displayBalance();
}

// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into savings account " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in savings account " + accountNumber);
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings account " + accountNumber + " balance: " + balance);
    }
}

// CurrentAccount.java
public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into current account " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from current account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in current account " + accountNumber);
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Current account " + accountNumber + " balance: " + balance);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("SA001", 1000, 0.05);
        Account currentAccount = new CurrentAccount("CA001", 2000);

        savingsAccount.displayBalance();
        currentAccount.displayBalance();

        savingsAccount.deposit(500);
        savingsAccount.displayBalance();

        currentAccount.withdraw(1000);
        currentAccount.displayBalance();
    }
}
