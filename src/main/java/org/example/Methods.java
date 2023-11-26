package org.example;

public class Methods {

    public void mult(int m ,int n)  //Whitout return type
    {
        int s = m * n;
        System.out.println(s);
    }
    public int mult1 (int p ,int q)  //With  return type
    {
        int r = p * q;
     //  System.out.println(r);
        return r;
    }

    public static void main(String [] args)
    {
        Methods m = new Methods();
        // tp.sum(5,7);
        m.mult(5,4);
        int obj = m.mult1(3,4);
        System.out.println(obj);


    }
}
