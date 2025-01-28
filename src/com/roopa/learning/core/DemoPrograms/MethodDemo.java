package com.roopa.learning.core.DemoPrograms;

class Computer
{
    public  void playMusic()
    //By writing Void System understands that it need not return any value for that particular method
    {
        System.out.println("Play Music");
    }

    public String getMeAPen(int expenses)
            ///By writing String datatype, System understands that it should return a value of String Datatype for this  method
    {
        if (expenses>=10)
          return "Pen";
        else
            return "Nothing";
    }
}



public class MethodDemo
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        //Here obj is a reference variable or instance of Computer Class is created
        //now we can call both methods using obj refernce variable
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
    }
}
