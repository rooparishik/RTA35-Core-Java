package com.roopa.learning.core.DemoPrograms;

public class ArithmaticOperators {

    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int result = x % y;

        int num1  = 8;
        // num1 = num1 + 2;
        //num1+= 2;
        //num1 += 1; or
        num1++;  // post incrementing by 1 is also same as above
        num1--;  // post decrement operation
        ++num1;  // pre increment operation
        --num1;  // pre decrement operation
        System.out.println(num1);
    }
}
