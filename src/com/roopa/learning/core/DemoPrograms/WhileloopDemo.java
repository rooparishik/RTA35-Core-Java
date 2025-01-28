package com.roopa.learning.core.DemoPrograms;

public class WhileloopDemo {

    public static void main(String[] args) {

        int i = 1;

        while(i<=4){

            System.out.println(" Hi "  +i);

            int j = 1;
            while (j<=3){

                System.out.println(" HRU " +j);
                j++;
            }

            i++;
        }
        System.out.println(" Bye " +i);
    }
}
