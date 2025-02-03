package com.roopa.learning.core.ControlStatements;

public class BreakAndContinueExamples {

    public static void main(String[] args) {
        //simpleBreakExample();
        simpleContinueExample();

    }
    /*
    Continue basically skips that  current iteration in a loop when a given condition
    satisfies or becomes true and moves further to the next iteration in the loop.
    whereas
    Break stops at that particular iteration and comes out of  loop when given
    condition satisfies or becomes true.
     */
    private static void simpleContinueExample(){
        for(int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i:: "+ i);
        }

    }

    private static void simpleBreakExample(){
        for(int i = 0; i < 10; i++){
            if (i==5) {
                break;
            }
            System.out.println("i:: "+ i);
        }
    }
}
