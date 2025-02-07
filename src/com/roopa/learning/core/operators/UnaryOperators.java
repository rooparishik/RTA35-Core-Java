package com.roopa.learning.core.operators;

public class UnaryOperators

{
    public static void main(String[] args) {

     /*   int count = 10;
        count++;

        while(count < 50){
            count += 10;
            count--;
        }
        System.out.println(count);
*/

        int counter = 1;

        System.out.println("pre increment ++counter ::" + ++counter);
        System.out.println("pre decrement --counter ::" + --counter);
        System.out.println("post increment counter++ ::" + counter++);
        System.out.println("post decrement counter-- ::" + counter--);
    }
}
