package com.bankmelli;


public class BankAccountSystem {

    // Properties for BankAccount
    static class BankAccount {
//حسابدار
        private final String accountHolder;
        // Arithmetic operators
        // مقدار یا تعادل
        private double balance;
// شماره حساب

        private final int accountNumber;

        // Constructor
        public BankAccount(String accountHolder, double balance, int accountNumber) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        // Getter and Setter
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        // Deposit money
        // سپرده گذاری
        public void deposit(double amount) {
            this.balance += amount; // Allocation and addition operator
            System.out.println(amount + " deposited. New balance: " + this. balance);
        }

        // Withdraw money
        // برداشت
        public void withdraw(double amount) {
            if (this.balance >= amount) {
                this.balance -= amount; // Allocation and reduction operator
                System.out.println(amount + " withdrawn. New balance: " + this. balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        // Calculate interest
        // مالیات  یا بهره
        public void calculateInterest(double rate) {
            double interest = this.balance * rate / 100; // Arithmetic operators
            System.out.println("Interest for " + this.accountHolder + ": " + interest);
        }

        // Logical comparison
        // تعادل بالاتر از آستانه است وظیفه متد
        public boolean isBalanceAboveThreshold(double threshold) {
            return this.balance > threshold; // Comparison operator
        }

        // Display account info
        public void displayInfo() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        // Create accounts
        BankAccount account1 = new BankAccount("John Doe", 5000, 12345);
        BankAccount account2 = new BankAccount("Jane Doe", 10000, 67890);

        // Arithmetic operations
        account1.deposit(2000); // Add money
        account2.withdraw(500); // Withdraw money

        // Logical operations
        if (account1.isBalanceAboveThreshold(3000)) {
            System.out.println(account1.getAccountHolder() + "'s balance is above the threshold.");
        }

        // Ternary operator
        String highBalanceMessage = account2.getBalance() > 8000 ? "High balance!" : "Low balance!";
        System.out.println(highBalanceMessage);

        // instanceof
        if (account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount.");
        }

        // Bitwise operation example (e.g., permissions simulation)
        int readPermission = 0b001; // Binary: 001
        int writePermission = 0b010; // Binary: 010
        int executePermission = 0b100; // Binary: 100

        int permissions = readPermission | writePermission; // Bitwise OR
        System.out.println("Combined Permissions: " + Integer.toBinaryString(permissions));

        // Check if writePermission exists
        boolean canWrite = (permissions & writePermission) != 0; // Bitwise AND
        System.out.println("Can write: " + canWrite);

        // Compound assignment
        double totalBalance = account1.getBalance();
        totalBalance += account2.getBalance(); // Combination operator
        System.out.println("Total balance of all accounts: " + totalBalance);

// Display account info
        account1.displayInfo();
        account2.displayInfo();
    }
}
