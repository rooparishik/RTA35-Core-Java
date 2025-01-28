package com.roopa.learning.core.DemoPrograms;

public class ExplicitCasting {

    public static void main(String[] args) {

        //byte b = 127;
        int a = 625;
        byte c = (byte) a;
        // here it will perform modulus operation i.e 625 % 256and answer is remainder
        float f = 6.5f;
        int d = (int)f;
        System.out.println(d);

        byte i = 10;
        byte j = 20;
        int result = i * j;
        //above when two byte values are multiplied we expect answer to be byte value
        //but when multiplication is done it is 300 which is above the range of byte
        //so here Java allows " Type Promotion " so it will accept integer as a result value.


        System.out.println(result);
    }
}
