package com.roopa.learning.core.controlstatements;

public class ForLoopExamples
{

       /*  Syntax of Forloop
        for(initialization_of_value; condition; Update_the_value){
        }
         */

    public static void main(String[] args) {
     //example1();
     //example2();
        //multipleVariableOnForloop();
        forLoopWithoutInitializationAndUpdate();
    }
    private static void  forLoopWithoutInitializationAndUpdate(){
       int i = 0;
       for(; i <= 5 ;){
            System.out.println("i: " + i);
            i++;

       }


    }

    private static void multipleVariableOnForloop(){
        for(int i = 0, j = 10 ; i <= 10 && j >= 0; i++, j--){
            System.out.println("i:: " + i + ", j:: " + j);
        }

    }
    private  static  void example2(){



        for (int i = 5; i>=1; i--){
            System.out.println(" Hello " +  i);
        }
    }


    private  static  void example1(){



        for (int counter = 0; counter<=10; counter++){
            System.out.println(" Hello " +  counter);
        }
    }
}
