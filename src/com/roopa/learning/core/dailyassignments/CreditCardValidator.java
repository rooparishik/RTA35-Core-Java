package com.roopa.learning.core.dailyassignments;

 class CardProcessor{

     // Static Nested Class
     public  static class CreditCardValidator{

         // static method
         public static boolean isValidCard(String cardNumber){
             System.out.println(" Validating Credit Card....");
             if(cardNumber.startsWith("4")){
                 System.out.println(" This Card with no " + cardNumber + " is valid Visa Card");
                    return true;
             } else if (cardNumber.startsWith("5")) {
                    System.out.println(" This Card with no " + cardNumber + " is valid Master Card");
                    return true;
                } else {
                    System.out.println(" This Card with no " + cardNumber + " is Invalid Card");
                    return false;
                 
             }
         }
     }
 }

public class CreditCardValidator {
    public static void main(String[] args) {
        String cardNumber1 = "5123456789012345";
        String cardNumber2 = "3782822463100054";

        CardProcessor.CreditCardValidator.isValidCard(cardNumber1);
        CardProcessor.CreditCardValidator.isValidCard(cardNumber2);
    }
}
