package com.roopa.learning.core.DemoPrograms;

/* Having two or more methods with same name but with different no of  parameters or
having same method name with different data type parameters  is usually referred to as
  " Method OverLoading " in Java.
   */

class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3)
    {
       return n1 + n2 + n3;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }

}
public class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
          Calc obj = new Calc();
          int result = obj.add(5,4);
          System.out.println(result);
    }
}
