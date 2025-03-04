package com.roopa.learning.core.dailyassignments;

class PaymentTransaction {
    private static int transactionCounter = 10000;
    private int transactionID;
    private String payerName;
    private double amount;
    private String paymentMode;


    public PaymentTransaction(String payerName, double amount, String paymentMode) {
        this.transactionID = transactionCounter++;
        this.payerName = payerName;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + this.transactionID  +  " , PayerName: " + this.payerName +  " , Amount : $" + this.amount  +  " , PaymentMode: " + this.paymentMode);

    }
}

public class UniqueTransactionIDPaymentSystem {

    public static void main(String[] args) {

        PaymentTransaction transaction1 = new PaymentTransaction("Alice", 500, "CreditCard");
        transaction1.displayTransactionDetails();

        PaymentTransaction transaction2 = new PaymentTransaction("Bob", 200, "PayPal");
        transaction2.displayTransactionDetails();

        PaymentTransaction transaction3 = new PaymentTransaction("Charlie", 750, "NetBanking");
        transaction3.displayTransactionDetails();


    }
}
