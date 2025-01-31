package com.roopa.learning.core.ControlStatements;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {


        System.out.println("Main Method Started");

        Scanner scan = new Scanner(System.in);


        System.out.println(" Enter the name for Application");
        String name = scan.nextLine();
        switchStatement(name);

        System.out.println(" Enter your Age");
        int age = scan.nextInt();
        ifSwitchStatement(age);

        System.out.println("Main method Ended");

    }
/*
Static methods belong to certain class for which instances need not be created.
In Java Static methods can execute/access only static methods.
non Static methods or Instance methods belongs to some instance/ object rather than a Class
.Instance methods can have n number of objects for same method,but Static method will have
only 1 copy of it which directly belongs to class.
*/
    //If we dont want to specify "Static" for any method then we have to create Object ,and
    //then call it referring to that object.That is the reason it is called as Instance Method

    private static void switchStatement(String name){

            System.out.println("Entering switchStatement method");
            switch (name) {
                case "Rishik" :
                    System.out.println("Kura");
                    break;
                case "Rajani" :
                    System.out.println("Kanth");
                    break;
                case "Roopa" :
                    System.out.println("Bussa");
                    break;
                case "Ayaan" :
                    System.out.println("Mukka");
                    break;
                case "Srihan":
                    System.out.println("Vutukuru");
                    break;
                case "Shourya" :
                    System.out.println("Cherry");
                    break;
                default :
                    System.out.println("does not belong to this family");
            }

            System.out.println("Exit switchStatement method");

        }

        private static void ifSwitchStatement(int age){

        System.out.println("Entering ifSwitchStatement Method");

        switch (age){
            case 18:
                System.out.println("Minor");
                break;
            case 21:
                System.out.println("Major");
                break;
            case 25:
                System.out.println("Adult");
                break;
            default :
                System.out.println("Not eligible");
        }

        System.out.println("Exit ifSwitchStatement Method");
        }

}
