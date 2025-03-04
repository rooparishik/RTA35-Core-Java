package com.roopa.learning.core.oops.finalkeyword;

class BankAccount {
    private final int accountNumber;
    private final String accountHolderName;
    public double balance;

    // Final variables can be initialized using constructors
    // Final variables can be initialized only once
    // Final variables can be initialized either at the time of declaration or in the constructor

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + this.accountNumber );
        System.out.println("Account Holder Name:  "+ this.accountHolderName );
        System.out.println("Balance: $" + this.balance);
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

}

public class FinalVariablesInitializationUsingConstructors {

    public static void main(String[] args) {

        BankAccount Ba = new BankAccount(555, "RRR", 50000);
        Ba.displayAccountDetails();
        Ba.deposit(10000);
        Ba.displayAccountDetails();
    }

}
