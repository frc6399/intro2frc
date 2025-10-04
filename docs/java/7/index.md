# 7. OOP Concepts

- [7.1. Basics of Inheritance](./1.md)
- [7.2. Method Overriding](./2.md)
- [7.3. Polymorphism in Java](./3.md)
- [7.4. Abstract Classes](./4.md)
- [7.5. Interfaces](./5.md)

## Project: Banking System

**Description:** Create a comprehensive banking system that demonstrates inheritance, polymorphism, method overriding, abstract classes, and interfaces. The system will handle different types of bank accounts with varying behaviors.

**Code Skeleton:** [Download](/assets/BankingSystemSkeleton.zip)

**Expected Output**:

```text
=== JAVA BANKING SYSTEM ===
Demonstrating OOP Concepts: Inheritance, Polymorphism, Abstract Classes, and Interfaces

=== INITIAL ACCOUNT STATUS ===
┌──────────────────────────┐
│ Account: SAV1001
│ Holder:  Alice Johnson
│ Balance: $1500.00
│ Type:    SavingsAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: CHK2001
│ Holder:  Bob Smith
│ Balance: $800.00
│ Type:    CheckingAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: FIX3001
│ Holder:  Carol Davis
│ Balance: $10000.00
│ Type:    FixedDepositAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: SAV1002
│ Holder:  David Wilson
│ Balance: $3000.00
│ Type:    SavingsAccount
└──────────────────────────┘
=== TRANSACTION PROCESSING ===
Deposited: $200.0 to SAV1001
Deposited: $100.0 to CHK2001
Withdrawn: $100.0 from savings SAV1001
Withdrawn: $1200.0 from checking CHK2001
Overdraft used. Balance: $-300.0
Withdrawal not allowed from fixed deposit FIX3001 before maturity

=== INTEREST APPLICATION ===
Interest: $40.00 added to SAV1001
No interest applied to checking account CHK2001
Interest: $900.00 added to fixed deposit FIX3001
Interest: $66.00 added to SAV1002

=== UPDATED ACCOUNT STATUS ===
┌──────────────────────────┐
│ Account: SAV1001
│ Holder:  Alice Johnson
│ Balance: $1640.00
│ Type:    SavingsAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: CHK2001
│ Holder:  Bob Smith
│ Balance: $-300.00
│ Type:    CheckingAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: FIX3001
│ Holder:  Carol Davis
│ Balance: $10900.00
│ Type:    FixedDepositAccount
└──────────────────────────┘
┌──────────────────────────┐
│ Account: SAV1002
│ Holder:  David Wilson
│ Balance: $3066.00
│ Type:    SavingsAccount
└──────────────────────────┘
=== BANK SERVICES ===

Transferring $250.0 from SAV1001 to CHK2001
Withdrawn: $250.0 from savings SAV1001
Deposited: $250.0 to CHK2001
Transfer completed successfully

=== BANK STATEMENT ===
Account: SAV1001
Holder: Alice Johnson
Balance: $1390.0
Type: SavingsAccount
Date: 2025-10-04
=========================

=== BANK STATEMENT ===
Account: FIX3001
Holder: Carol Davis

Total balance across all accounts: $15306.0

=== BANK INFORMATION ===
Bank Policy: All accounts are FDIC insured up to $250,000
Total accounts in system: 4

=== ACCOUNT TYPE ANALYSIS ===
Savings Account SAV1001 has interest rate: 2.5%
Checking Account CHK2001 has overdraft limit: $500.0
Fixed Deposit FIX3001 has term: 24 months
Savings Account SAV1002 has interest rate: 2.1999999999999997%
```
