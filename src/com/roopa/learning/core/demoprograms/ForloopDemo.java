package com.roopa.learning.core.demoprograms;

public class ForloopDemo
{
    public static void main(String[] args)
    {
         for (int i=1; i <= 5; i++)
         {

             System.out.println(" Day " + i);

             for (int j = 1; j <= 9; j++)
             {
                 /*In for loop it checks for  Variable declaration ,Condition and then executes the
                  body/Block first and later counter or variable gets incremented or decremented
                   as specified in the loop */
                 System.out.println("Work at this Hour  " + (j + 8) +" - " + (j + 9));
             }

         }
    }
}
