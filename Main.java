package com.example.Anudip_2LabQuestion;

import java.util.Scanner;

class Bank {
    private double amount; // account balance

    // Constructor to initialize amount to 10000
    public Bank() {
        this.amount = 10000;
    }

    // Method for withdrawal using ternary operator
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        // Deduct only if amount is sufficient
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful: " + depositAmount);
    }

    // Display account balance
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account = new Bank(); // starting balance = 10000

        // Take withdrawal input
        System.out.print("Enter amount to withdraw: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        // Take deposit input
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Show final balance
        account.displayBalance();

        sc.close();
    }
}
