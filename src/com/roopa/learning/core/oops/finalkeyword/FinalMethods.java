package com.roopa.learning.core.oops.finalkeyword;

class SecuritySystem {

    //final methods cannot be overridden
    //final keyword in method is a way to prevent the method from being overridden by the subclasses
    //final methods are faster than non-final methods because they are resolved at compile time
    //final methods are inherited but cannot be overridden
    //but they can be overloaded.

    public final void connectToSecuredSystem() {
        System.out.println("Connecting to secured system");

    }

    //final methods can be overloaded

    public final void connectToSecuredSystem(String username, String password) {
        System.out.println("Connecting to secured system using username: " + username + " and password: " + password);
    }
}

class BankSecuritySystem extends SecuritySystem {
    //    Cannot override final method from SecuritySystem
    //    this method cannot be overridden because it is declared as final in the parent class
    //    public void connectToSecuredSystem() {
    //        System.out.println("Connecting to secured system from BankSecuritySystem");
    //    }

    //    Cannot override final method from (SecuritySystem) or Parent class in java

   /* public void connectToSecuredSystem(String username, String password) {
        System.out.println("Connecting to secured system from BankSecuritySystem using username: " + username + " and password: " + password);
    }*/

    // can overload final method from SecuritySystem/Parent class

    public void connectToSecuredSystem(String connectionUrl) {
        System.out.println("Connecting to secured system from BankSecuritySystem using url: " +connectionUrl);
    }
}
public class FinalMethods {
    public static void main(String[] args) {
        BankSecuritySystem bankSecuritySystem = new BankSecuritySystem();
        bankSecuritySystem.connectToSecuredSystem();
        bankSecuritySystem.connectToSecuredSystem("admin", "admin");
        bankSecuritySystem.connectToSecuredSystem("http://localhost:8080");
    }
}
