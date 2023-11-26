package org.example;

public class Thispractice {

    int d=100;
    int e= 50;
    public void sum(int a ,int b)

    {
        int c= a+b;
        System.out.println(c);
    }

    public void diff(int d,int e) //refering global values for variables using this keyword

    {
        int f= this.d- this.e;
        System.out.println(f);
    }

    public static void main(String [] args)
    {
        Thispractice tp= new Thispractice();
       // tp.sum(5,7);
        tp.diff(10,5 );
    }



}
