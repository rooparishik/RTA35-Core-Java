package com.roopa.learning.core.DailyAssignments;

import java.util.Scanner;

public class sumOfNNaturalNumbers {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a positive integer : ");
        int n = scanner.nextInt();
       /* int sum = (n*(n+1))/2;
        System.out.println(" the sum of first " + n + " numbers is :" +sum);
        scanner.close(); */

        //writing the above prgm using loop

        int sum = 0;
        for(int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
            System.out.println("The sum of first " + n + " natural numbers is : " + sum);
        scanner.close();

    }
}
