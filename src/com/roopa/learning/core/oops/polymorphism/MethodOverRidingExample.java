package com.roopa.learning.core.oops.polymorphism;


class  Payment{

    public void processPayment(double amount){
        System.out.println("Processing the payment of:" + amount);
    }
}

class CreditCard extends Payment{

    public void processPayment(double amount){
        System.out.println("Processing the payment of " + amount +"  through CreditCard") ;
    }
}

class  Paypal extends Payment{
    public void processPayment(double amount){
        System.out.println("Processing the payment of " + amount + " through PayPal");
    }
}

public class MethodOverRidingExample {

    public static void main(String[] args) {

        Payment payment;  //Parent type Reference Variable
        payment = new CreditCard();
        payment.processPayment(5000);

        payment = new Paypal();
        payment.processPayment(8000);


    }
}

/* In the above case which method to be called depends on the object created with reference to
Parent variable which is created at Runtime. hence this is called " Runtime PolyMorphism "
or Method OVerRiding or also called as "Dynamic Dispatch" or "Dynamic PolyMorphism" or
"Late Binding".

In Method OverRiding 2 or more methods of differnt classes will have same name and properties
of parent Class, but will implement different  behaviour than parent Class.
Since it is Overriding the behaviour of Parent Class ,this process is called as Method OverRiding.
 */