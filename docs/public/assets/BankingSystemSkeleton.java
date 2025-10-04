public class BankingSystemSkeleton {
    public static void main(String[] args) {
        System.out.println("=== JAVA BANKING SYSTEM ===");
        System.out.println("Demonstrating OOP Concepts: Inheritance, Polymorphism, Abstract Classes, and Interfaces\n");

        // TODO: Create different types of accounts and store them in an array

        // TODO: Display initial account information

        // TODO: Process deposits and withdrawals

        // TODO: Apply interest to accounts

        // TODO: Display updated account information

        // TODO: Demonstrate interface usage (transfer, generate statements, calculate
        // total balance)

        // TODO: Demonstrate static methods and instanceof usage
    }
}

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected static int totalAccounts = 0;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public abstract void applyInterest();

    public abstract double getMinimumBalance();

    public void deposit(double amount) {
        // TODO: Implement deposit logic
    }

    public void withdraw(double amount) {
        // TODO: Implement withdrawal logic
    }

    public void displayAccountInfo() {
        // TODO: Display account information
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void printBankPolicy() {
        // TODO: Print bank policy
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        // TODO: Implement interest application for savings account
    }

    @Override
    public double getMinimumBalance() {
        return 50.0;
    }

    @Override
    public void withdraw(double amount) {
        // TODO: Implement withdrawal logic for savings account
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void applyInterest() {
        // TODO: Implement interest application for checking account
    }

    @Override
    public double getMinimumBalance() {
        return 0.0;
    }

    @Override
    public void withdraw(double amount) {
        // TODO: Implement withdrawal logic for checking account
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, String accountHolder, double initialBalance, int termMonths,
            double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        // TODO: Implement interest application for fixed deposit account
    }

    @Override
    public double getMinimumBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        // TODO: Implement withdrawal logic for fixed deposit account
    }

    public int getTermMonths() {
        return termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

interface BankService {
    void transfer(BankAccount from, BankAccount to, double amount);

    void generateStatement(BankAccount account);

    double calculateTotalBalance(BankAccount[] accounts);
}

class BankServiceImpl implements BankService {
    @Override
    public void transfer(BankAccount from, BankAccount to, double amount) {
        // TODO: Implement transfer logic
    }

    @Override
    public void generateStatement(BankAccount account) {
        // TODO: Implement statement generation
    }

    @Override
    public double calculateTotalBalance(BankAccount[] accounts) {
        // TODO: Implement total balance calculation
        return 0;
    }
}
