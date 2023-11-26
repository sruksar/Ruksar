package org.example;

public class Variable {

    static int a=500;
    static int c;
    void m1()
    {

        System.out.println(a);
        System.out.println("printing static variable values with intailization");
    }

    void m2()
    {
        int e=50;
        System.out.println(c);
        System.out.println(e);
        System.out.println("printing static variable values with default value");
    }

    public static void main(String[] args) {

        Variable v =new Variable();
        v.m1();
        v.m2();


    }}

