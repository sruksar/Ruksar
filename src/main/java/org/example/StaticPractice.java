package org.example;

public class StaticPractice {

    static String empname ="Rohit";  //Static variable
    String email ="rohit@gmail.com";

    public static void  staticmethod()
    {
        System.out.println("Static methood call");
    }

    public void NonStaticMethod()
    {
        System.out.println("Non Static methood call");
    }

public  static void main(String args[])

{
    System.out.println(StaticPractice.empname); //static variable print
    StaticPractice sp= new StaticPractice();

    System.out.println(sp.email); //Non static variable print

    staticmethod();  //Static method call
    sp.NonStaticMethod();  // Non static method call
}
}
