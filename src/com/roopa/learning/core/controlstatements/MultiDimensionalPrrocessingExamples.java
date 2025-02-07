package com.roopa.learning.core.controlstatements;

public class MultiDimensionalPrrocessingExamples {

    public static void main(String[] args) {
        //loopInsideLoop();
        //twoDimensionalArrayProcessing();
        starPattern();

    }






    private static void starPattern(){
        int rows = 5;
          for(int i = 1; i <= rows ; i++){

              for(int j = 1; j <= i; j++ ){
                  System.out.print("* ");
              }
              System.out.println();
          }



    }
    private static void twoDimensionalArrayProcessing(){
         int numbers[][] = {
                 {1,2,3,67,87,12,16},
                 {4,5,6,53,17},
                 {7,8,9,21,20,28},
         };

         for(int row = 0; row < numbers.length ; row++){
             for(int column = 0; column < numbers[row].length ; column++){

                 System.out.print(numbers[row][column] + "   ");
             }
             System.out.println();
         }




    }

    private static void loopInsideLoop(){

        for(int i = 0; i <= 5; i++){
            System.out.println("i:: " + i);
            for(int j = 0; j <= 5; j++){
                System.out.println(" j:: " + j);
            }
            System.out.println();
        }
    }
}
