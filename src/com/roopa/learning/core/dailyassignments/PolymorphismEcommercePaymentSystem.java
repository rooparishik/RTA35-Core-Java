package com.roopa.learning.core.dailyassignments;

class Payment {
    double amount;

    public void processPayment(double amount){
        System.out.println("Processing Payment of amount :" +amount);

    }
}
class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing CreditCardPayment of amount :" +amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing PayPalPayment of amount :" +amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing UPIPayment of amount :" +amount);
    }
}

public class PolymorphismEcommercePaymentSystem {

    public static void main(String[] args) {

        Payment payment ;
        payment = new CreditCardPayment();
        payment.processPayment(4000);

        payment = new PayPalPayment();
        payment.processPayment(5000);

        payment = new UPIPayment();
        payment.processPayment(3000);


    }

}
