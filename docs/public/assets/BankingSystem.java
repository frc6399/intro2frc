public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("=== JAVA BANKING SYSTEM ===");
        System.out.println("Demonstrating OOP Concepts: Inheritance, Polymorphism, Abstract Classes, and Interfaces\n");

        // Create different types of accounts - polymorphism in action
        BankAccount[] accounts = {
                new SavingsAccount("SAV1001", "Alice Johnson", 1500.0, 0.025),
                new CheckingAccount("CHK2001", "Bob Smith", 800.0, 500.0),
                new FixedDepositAccount("FIX3001", "Carol Davis", 10000.0, 24, 0.045),
                new SavingsAccount("SAV1002", "David Wilson", 3000.0, 0.022)
        };

        // Display initial account information
        System.out.println("=== INITIAL ACCOUNT STATUS ===");
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }

        // Demonstrate polymorphism and method overriding
        System.out.println("=== TRANSACTION PROCESSING ===");

        // Process deposits (inherited method)
        accounts[0].deposit(200.0);
        accounts[1].deposit(100.0);

        // Process withdrawals (overridden methods)
        accounts[0].withdraw(100.0); // Savings - respects minimum balance
        accounts[1].withdraw(1200.0); // Checking - uses overdraft
        accounts[2].withdraw(500.0); // Fixed deposit - withdrawal denied

        // Apply interest (abstract method implementation)
        System.out.println("\n=== INTEREST APPLICATION ===");
        for (BankAccount account : accounts) {
            account.applyInterest();
        }

        // Display updated information
        System.out.println("\n=== UPDATED ACCOUNT STATUS ===");
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }

        // Demonstrate interface usage
        System.out.println("=== BANK SERVICES ===");
        BankService bankService = new BankServiceImpl();

        // Transfer between accounts
        bankService.transfer(accounts[0], accounts[1], 250.0);

        // Generate statements
        bankService.generateStatement(accounts[0]);
        bankService.generateStatement(accounts[2]);

        // Calculate total balance
        double totalBalance = bankService.calculateTotalBalance(accounts);
        System.out.println("\nTotal balance across all accounts: $" + totalBalance);

        // Demonstrate static method from abstract class
        System.out.println("\n=== BANK INFORMATION ===");
        BankAccount.printBankPolicy();
        System.out.println("Total accounts in system: " + BankAccount.getTotalAccounts());

        // Demonstrate instanceof and casting
        System.out.println("\n=== ACCOUNT TYPE ANALYSIS ===");
        for (BankAccount account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savings = (SavingsAccount) account;
                System.out.println("Savings Account " + account.getAccountNumber() +
                        " has interest rate: " + (savings.getInterestRate() * 100) + "%");
            } else if (account instanceof CheckingAccount) {
                CheckingAccount checking = (CheckingAccount) account;
                System.out.println("Checking Account " + account.getAccountNumber() +
                        " has overdraft limit: $" + checking.getOverdraftLimit());
            } else if (account instanceof FixedDepositAccount) {
                FixedDepositAccount fixed = (FixedDepositAccount) account;
                System.out.println("Fixed Deposit " + account.getAccountNumber() +
                        " has term: " + fixed.getTermMonths() + " months");
            }
        }
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
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " to " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient funds in " + accountNumber +
                    " for withdrawal: $" + amount);
        }
    }

    public void displayAccountInfo() {
        System.out.println("┌──────────────────────────┐");
        System.out.println("│ Account: " + accountNumber);
        System.out.println("│ Holder:  " + accountHolder);
        System.out.println("│ Balance: $" + String.format("%.2f", balance));
        System.out.println("│ Type:    " + this.getClass().getSimpleName());
        System.out.println("└──────────────────────────┘");
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void printBankPolicy() {
        System.out.println("Bank Policy: All accounts are FDIC insured up to $250,000");
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

    public SavingsAccount(String accountNumber, String accountHolder,
            double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest: $" + String.format("%.2f", interest) +
                " added to " + accountNumber);
    }

    @Override
    public double getMinimumBalance() {
        return 50.0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= getMinimumBalance()) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from savings " + accountNumber);
        } else {
            System.out.println("Withdrawal denied from " + accountNumber +
                    ": Minimum balance requirement not met");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
            double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void applyInterest() {
        System.out.println("No interest applied to checking account " + accountNumber);
    }

    @Override
    public double getMinimumBalance() {
        return 0.0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from checking " + accountNumber);
            if (balance < 0) {
                System.out.println("Overdraft used. Balance: $" + balance);
            }
        } else {
            System.out.println("Withdrawal denied from " + accountNumber +
                    ": Exceeds overdraft limit");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, String accountHolder,
            double initialBalance, int termMonths, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        double interest = balance * interestRate * (termMonths / 12.0);
        balance += interest;
        System.out.println("Interest: $" + String.format("%.2f", interest) +
                " added to fixed deposit " + accountNumber);
    }

    @Override
    public double getMinimumBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed from fixed deposit " +
                accountNumber + " before maturity");
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
        System.out.println("\nTransferring $" + amount + " from " +
                from.getAccountNumber() + " to " + to.getAccountNumber());

        double originalBalance = from.getBalance();
        from.withdraw(amount);

        if (from.getBalance() < originalBalance) {
            to.deposit(amount);
            System.out.println("Transfer completed successfully");
        } else {
            System.out.println("Transfer failed");
        }
    }

    @Override
    public void generateStatement(BankAccount account) {
        System.out.println("\n=== BANK STATEMENT ===");
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Type: " + account.getClass().getSimpleName());
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("=========================");
    }

    @Override
    public double calculateTotalBalance(BankAccount[] accounts) {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}