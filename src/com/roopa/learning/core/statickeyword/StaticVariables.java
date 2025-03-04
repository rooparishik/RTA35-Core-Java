package com.roopa.learning.core.statickeyword;

class BankAccount {

    //Instance variables
    //Object level variables
    private String accountHolderName;
    private  double balance;

    //static variable for common interest rate
    //class level variable
    private static double interestRate = 8.5;

    // Parameterized Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    //Static methods will be loaded at the very early stages while loading Class,
    //during which Objects are not created yet.
    //So ,Static method can access only static variables.
    //Static method to update the interest rate:
    public static void setInterestRate(double rate){
        interestRate = rate;
    }

    //Instance method to display account details:
    //Instance methods belong to the Object,
    //and they can access both instance variables and static variables.
    public void displayAccount(){
        System.out.println("Account Holder Name : " + this.accountHolderName + " Balance : " + this.balance + " Interest Rate : " + interestRate);
    }


}


public class StaticVariables {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Roopa",5000);
        BankAccount account2 = new BankAccount("Bussa",10000);


        //Instance method can be accessed using the object reference
        //Non-static methods can be accessed using the object reference
        account1.displayAccount();
        account2.displayAccount();


        // Setting the interest rate using the static method
        // These methods can be accessed using the class name
        // It is not good practice to access static variables using object reference.
        BankAccount.setInterestRate(9.5);

        account1.displayAccount();
        account2.displayAccount();


    }
}
