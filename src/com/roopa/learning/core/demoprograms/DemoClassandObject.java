package com.roopa.learning.core.demoprograms;
class Calculator
{
    public  int add(int n1, int n2)
    {
        int r = n1 + n2;
        return  r;
    }

}
public class DemoClassandObject
{

    public static void main(String[] args)
    {
       int num1 = 4;
       int num2 = 5;
       //creation of object calc of type calculator

        Calculator calc = new Calculator(); //instance of class Calculator
        int result = calc.add(num1,num2);


       //int result = num1 + num2;
       System.out.println(result);
    }
}
