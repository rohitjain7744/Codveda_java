package banking;

import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Current balance: ₹" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Check Balance Method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
