package com.roopa.learning.core.oops.abstraction;

/* Abstract Class is the class which is declared with "abstract" keyword & have Abstract Methods.
 It can have both abstract and concrete methods.
 If a class has 1 abstract method, then that class should be declared as Abstract Class.
 Abstract Class is almost same as Concrete Class/Normal Class except the keyword Abstract
 has to be mentioned for Abstract Class and object cannot be initiated in Abstract
 Class.
 */

// Here Bank is Abstract Class:

 abstract  class Bank {
     /* Abstract method is the method which is declared with abstract keyword, it has only method
        signature or declaration and no method body  in it. */
   abstract void withDrawMoney(double amount);


   /*Concrete Method:
   Concrete Method is the method which has both method declaration/signature and
   Method body in it.
    */

    public void checkBalance(){

        System.out.println(" Checking Balance...");
     }


 }

 // Concrete SubClass:

 class ATM extends  Bank {


     public void withDrawMoney(double amount) {

       System.out.println("Withdrawing amount from ATM: " + amount);
     }

 }

 // Concrete SubClass:

 class OnlineBanking extends Bank {

 @Override
 public void withDrawMoney(double amount) {

     System.out.println("Withdrawing amount from OnlineBanking :" + amount);
 }
  }

  public class BankAbstractionExample {

     public static void main(String[] args) {

         Bank myBank;

         myBank = new ATM();
         myBank.withDrawMoney(2000);

         myBank = new OnlineBanking();
         myBank.withDrawMoney(5000);

     }
 }
// we cannot create an object of abstract class.
// In the above case ,if we try to create an object for Bank, it cannot be created.
// But we can create objects for the Subclasses of an Abstract Class.
