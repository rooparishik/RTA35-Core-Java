package com.roopa.learning.core.oops.abstraction;

/* Interface is defined with "interface" keyword.
It acts just like a class. Here all the child classes will implement parent Class,
instead of using keyword "extends" in a Normal class.
Interface can have only Abstract methods.
By default all the methods in Interface are Public abstract.
All the variables whether mentioned or not ,they are by
default public static final variables.
 */

interface Payment{

    //abstract method
    void processPayment(double amount);

}

class PayPalPayment implements  Payment{

  @Override
  public void processPayment(double amount){
      System.out.println("Processing through PayPalPayment :" +amount);
  }

}

class  CreditCard implements  Payment{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing through CreditCard :" +amount);
    }

}

class  DebitCard implements  Payment{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing through debitCard :" +amount);
    }

}

class  UPIPayment implements  Payment{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing through UPIPayment :" +amount);
    }

}

public class PaymentAbstractionThroughInterfaceExample {

    public static void main(String[] args) {

        Payment paymentMethod;

        paymentMethod = new PayPalPayment();
        paymentMethod.processPayment(200);

        paymentMethod = new CreditCard();
        paymentMethod.processPayment(300);

        paymentMethod = new DebitCard();
        paymentMethod.processPayment(400);

        paymentMethod = new UPIPayment();
        paymentMethod.processPayment(500);

    }
}
