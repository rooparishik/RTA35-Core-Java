package com.roopa.learning.core.dailyassignments;

class PaymentGateway {
    // Static Block
    static {
        System.out.println("Initializing Payment Gateway... Loading API Keys...");
    }

    //Static Method
    public static void processPayment(String payer, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + payer);
    }
}
public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentGateway.processPayment("Alice", 250);
        PaymentGateway.processPayment("Bob", 120.50);

    }
}
