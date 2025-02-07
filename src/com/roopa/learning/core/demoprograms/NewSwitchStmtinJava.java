package com.roopa.learning.core.demoprograms;

public class NewSwitchStmtinJava {

    public static void main(String[] args) {

        //prgm  to read a day and print the time according to the day

        String day = "wed";
        String result = "";
        /*

        switch (day){
            case "Saturday" ,"Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default ->  System.out.println("7am");

            //We can do the same prgm above by just declaring another variable as follows
            */

      /*  switch (day){
            case "Saturday" ,"Sunday" -> result = ("6am");
            case "Monday" -> result = ("8am");
            default ->  result = ("7am");

       */
        // to make the above prgm retun the value directly we can just initialize result before switch stmt

      /*  result = switch (day){
            case "Saturday" ,"Sunday" ->  ("6am");
            case "Monday" -> ("8am");
            default ->   ("7am");

       */


        //Since this has become an Expression ; is mandatory now

        //NOw if we dont want to use arrow and use colon then we have to replace it by
        //using keyword "Yield"


        result = switch (day) {
            case "Saturday", "Sunday": yield "6am";
            case "Monday": yield "8am";
            default: yield ("7am");
        };
                System.out.println(result);

    }
}
