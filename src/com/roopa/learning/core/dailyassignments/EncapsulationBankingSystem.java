package com.roopa.learning.core.dailyassignments;

import com.roopa.learning.core.oops.encapsulation.BankAccount;

class BOABankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BOABankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully  into  " + accountHolderName + "'s account");
        } else {
            System.out.println(" Deposit amount should be positive");
        }
    }

    public void withDraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw of " + amount + "  is successful from " + accountHolderName + "'s account");

        } else {
            System.out.println("Insufficient funds and Balance is Negative");
        }
    }
}


public class EncapsulationBankingSystem {

    public static void main(String[] args) {

        BOABankAccount myAcc1 = new BOABankAccount(555,"Roopa",500);
        BOABankAccount myAcc2 = new BOABankAccount(666,"Raj",5000);
        myAcc1.deposit(500);
        myAcc1.withDraw(200);
        myAcc1.withDraw(1000);

        myAcc2.deposit(2000);
        myAcc2.withDraw(6000);
        myAcc2.withDraw(2000);


    }


}



