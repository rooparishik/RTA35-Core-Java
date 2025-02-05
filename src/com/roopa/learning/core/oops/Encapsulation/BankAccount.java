package com.roopa.learning.core.oops.Encapsulation;

public class BankAccount {

    public double getBalance() {
        return balance;
    }

    private double balance;


    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            System.out.println("Initial balance should not be a negative value");
        }
    }
    //deposit method
          public void deposit(double amount){
             if(amount > 0){
                 balance += amount;
                 System.out.println("Deposited : " +amount);
             }else{
                 System.out.println("Deposit amount should be positive value");
             }
          }

    //withdraw method

           public  void withdraw(double amount){
               if(amount > 0 && amount <= this.balance){
                   balance -= amount;
                   System.out.println("withdrawn success for :" +amount);
               }else{
                   System.out.println("Insufficient Funds");
               }
           }

}


class  Runner{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(500);
        account.deposit(1000);

        account.withdraw(5000);
        account.withdraw(200);

        System.out.println("Current Balance :" +account.getBalance());
    }
}