package com.roopa.learning.core.oops.inheritance;

import java.util.concurrent.Callable;

public class BankAccount {

    /* Default constructor is invoked by JVM when we dont provide any customized
    constructor.
    for Ex : Here we didnot specify any constructor for BankAccount class,but still
    this "BankAccount Class" can inherit all the properties of "Object Class" because
    JVM will invoke  the "default constructor".
    Inheritance will happen only through Constructors,where Child class can inherit
    properties and behaviour of an Parent Class through a process
     called "Constructor chaining" once it establishes a " is-A Relationship" with
     another class.
    Here Inheritance is happening through the
    "Zero arugument constructor /Default Constructor".
    Using keyword "super()" we can call "parent class Constructor"
    */

    private  String accountNumber;
    private  double balance;

    //Initializing a  Parameterized Constructor

    public BankAccount(String accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited amount :" +amount);
    }

    protected void withdraw(double amount){

        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Succesfull for amount :"+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

class SavingsAccount extends BankAccount {

    private double interest;

    public SavingsAccount(String accountNumber, double balance, double interest) {
        super(accountNumber, balance);//Invoking parent class constructor which is called as "Constructor Chaining."
        this.interest = interest;
    }

    public void applyInterest() {
        double interestEarnedAmount = (this.getBalance() * (interest / 100) * 3 / 12) / 100;
        this.deposit(interestEarnedAmount);
    }
}

class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit){

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public  void  deposit(double amount){
        overdraftLimit += amount;
        System.out.println("Amount paid to OverDraftLimit:" + amount);
    }

    public void withdraw(double amount){
        double availableBalance = super.getBalance() + overdraftLimit ;
        if(amount <= availableBalance){
           this.overdraftLimit -= amount;
            System.out.println("withdraw success from CurrentAccount for amount:" + amount);
            System.out.println("CurrentAccount Balance :" + (this.overdraftLimit + super.getBalance()));
        }else{
            System.out.println("Exceeds Overdraft Limit");
        }
    }

    @Override
    public double getBalance() {
        return super.getBalance() + overdraftLimit ;
    }
}

class BankRunner{

    public static void main(String[] args) {

        BankAccount SavingsAccount = new SavingsAccount("SAC005",7000,3.5);
        BankAccount CurrentAccount = new CurrentAccount("CAC005",3000,500000 );

        SavingsAccount.deposit(8000);
        SavingsAccount.withdraw(5000);
        System.out.println(SavingsAccount.getBalance());
        SavingsAccount.withdraw(100000);

        System.out.println(CurrentAccount.getBalance());
       CurrentAccount.withdraw(20000);

    }

}
