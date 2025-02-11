package com.roopa.learning.core.demoprograms;

public class ArrayDemo {
    public static void main(String[] args) {
        //single Dimensional Array


     /*   int nums[] = {2,3,4};
        for(int i = 0; i <= 2; i++) {
            System.out.print(nums[i] + " ");
        } */

        //MultiDimensional Array


      /*  int nums1[][] = new int[3][4];
        for(int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                nums1[i][j] = (int) (Math.random() * 10);
            }
        }


        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }*/

        // Jagged Array(which means no of rows or columns may not be fixed)

        int nums[][] = new int[3][]; //Jagged Array bcoz no of columns is not known
        nums[0] = new int[5];
        nums[1] = new int[7];
        nums[2] = new int[3];

        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        //extended for loop

        for(int n[]: nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
