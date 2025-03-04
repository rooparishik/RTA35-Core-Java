package com.roopa.learning.core.dailyassignments;

class CurrencyConverter {

    // static final variables
    static  final  double USD_TO_INR = 87.5;
    static  final  double EURO_TO_INR = 90.5;

    // static method to convert USD to INR
    public static double convertUSDtoINR(double amount){
        return amount * USD_TO_INR;
    }
    // static method to convert EURO to INR
    public static double convertEUROtoINR(double amount){
        return amount * EURO_TO_INR;
    }
}

public class CentralizedCurrencyConverter {

    public static void main(String[] args) {

        double amountInUSD = 100;
        // Static method is called using class name
        System.out.println("Amount in USD: " + amountInUSD + " is equal to INR: " + CurrencyConverter.convertUSDtoINR(amountInUSD));

        double amountInEURO = 50;
        System.out.println("Amount in EURO: " + amountInEURO + " is equal to INR: " + CurrencyConverter.convertEUROtoINR(amountInEURO));
    }
}
