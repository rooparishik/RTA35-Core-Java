package com.roopa.learning.core.oops.constructors;

/* Constructor which is explicitly defined by the programmer,by passing arguments
is called Parameterized Constructor.
This Constructor is required to initialize the values properly
at the time of Object creation.
 */

class BankAccount{

    private int accountNumber;
    private double balance;
    private  String accountHolderName;

    // defining Parameterized Constructor

    public BankAccount(int accNum,double bal, String accHN){
        this.accountNumber = accNum;
        this.balance = bal;
        this.accountHolderName = accHN;

        /* Here " this " keyword refers to the properties defined at th class level.
        So the values which are set in the parameterized constructor ,are assigned to the
        properties defined at the class level.
         */

    }

    public BankAccount(int accountNumber){

        this.accountNumber = accountNumber;
    }


    /* This is called Constructor Overloading;
    Constructor Overloading is having two Constructors with "same name", but with
    different no of parameters, or different datatypes of same parameters ,
    or having same parameters but defined in different order.
    Constructor OverLoading happens within the same class.
    We need Constructor Overloading when we want to create a Object ia a different way
    or in a different state.
     */

    public void display(){

        System.out.println("AccountNumber : " + this.accountNumber + " Balance : " + this.balance + " AccountHolderName : " + this.accountHolderName);
    }
}


public class ParameterizedConstructorExample {

    public static void main(String[] args) {

        BankAccount hdfcBank = new BankAccount(101,5000,"Roopa");
        BankAccount boABank = new BankAccount(255);
        BankAccount sbiBank = new BankAccount(440,2000,"");
        hdfcBank.display();
        boABank.display();
        sbiBank.display();



    }
}
